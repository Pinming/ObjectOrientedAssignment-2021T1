# 题目 1 — 文件读写
本次实验需要将 Unit3-2 中的复试系统改为从文件中读取试题信息并将部分学生试卷信息输出到文件中。

准备工作：在开始本练习之前，您需要精通以下知识：
- Java API - `StringTokenizer` 类的相关知识；
- 文件读写的相关知识：
    - [ ] 怎样从文件中读取数据；
    - [ ] 怎样向文件中写入数据。

目的：增强使用文件读写的能力
背景：在此作业中，您将创建另一个版本的复试系统。在以前的版本中，试题库的试题数据在应用程序中进行了硬编码。  在此版本中，将从文件中加载数据。  而且，用户将能够以以下三种格式之一将学生试卷信息写入文件：纯文本，HTML 或 XML。部分工作已为您完成，并在学生资料中提供。您将实现加载试题库的试题数据并保存学生试卷信息的代码。

## 数据文件

试题类型主要分为三种：英语题、数学题和专业课题。`testCatalog.dat` 文件存储着试题库数据。`testCatalog.dat` 中的每一行只包含一个试题。

字段由下划线分割，假定字段本身不包含任何下划线。

### 英语题数据的格式

```
EnglishTest_code_title_difficultyDegree_scoreCriteria_type
```

其中：`EnglishTest` 是标识该行试题类型的前缀；`code` `(String)` 表示英语题的代码；`title` `(String)` 表示英语题的题干；`difficultyDegree` `(int)` 表示英试题的难度系数，其后两项均为 `String` 类型，分别表示英试题的得分标准和类型。

### 数学题数据的格式
```
MathTest_code_title_difficultyDegree_scoreCriteria_photoURL_calculationProcess
```



其中：`MathTest` 是标识该行试题类型的前缀；`code` `(String)` 表示数学题代码；`title` `(String)`表示数学题题干；`difficultyDegree` `(int)` 表示数学题的难度系数，其后三项均为 `String` 类型，分别表示数学题的得分标准、图片地址和计算过程。

### 专业题数据的格式
```
ProfessionalTest_code_title_difficultyDegree_scoreCriteria_programInstruction_programming_photoURL
```

其中：`ProfessionalTest` 是标识该行试题类型的前缀；`code` `(String)` 表示专业题代码；`title` `(string)` 表示专业题题干；`difficultyDegree` `(int)` 表示专业题的难度系数，其后四项均为 `String` 类型，分别表示专业题的得分标准、程序说明、程序体和图片地址。  

## 类图

下面是复试系统类图的一部分，显示了用于加载试题库的类图元素。
![](https://img01.sogoucdn.com/app/a/100520146/a8fe8cac7d06050f8be2dd41d31587d7)

### 部分类与接口说明
其中部分类已经出，可以直接使用。

#### 接口 `FushiTestDatabaseLoader`
接口 `FushiTestDatabaseLoader` 声明用于生成试题库的方法。
方法：
```JAVA
    //将指定文件中的信息加载到试题库中并返回试题库。
    Catalog loadTestDatabase(String fileName) throws FileNotFoundException, IOException, DataFormatException {
        ...
    }   
```
#### 类 `DataFormatException`
当正在分析的文件中有一行出现以下错误时，将抛出异常。
- 该行没有预期数量的字段；
- 应包含数字的字段却没有包含数字。

#### 类 `FileFushiTestDatabaseLoader`
类 `FileFushiTestDatabaseLoader`实现接口 `FushiTestDatabaseLoader`。它用于从文件中获取试题库。 
方法：
1) 此方法读取一行英语试题数据。它使用 `StringTokenizer` 类提取指定行中的英语试题数据。如果该行没有错误，则此方法返回一个封装英语试题数据的 `EnglishTest` 对象。如果该行有错误，则该方法引发一个 `DataFormatException`，其中包含格式错误的数据行。
```JAVA
private EnglishTest readEnglishTest(String line)
    throws DataFormatException
```

2) 此方法读取一行数学试题数据。 它使用 `StringTokenizer` 类提取指定行中的数学试题数据。 如果该行没有错误，则此方法返回一个封装数学试题数据的 `MathTest` 对象。如果该行有错误，则该方法引发一个 `DataFormatException`，其中包含格式错误的数据行。
```JAVA
private MathTest readMathTest (String line) 
    throws DataFormatException
```

3) 此方法读取一行专业题数据。 它使用 `StringTokenizer` 类提取指定行中的专业题数据。 如果该行没有错误，则此方法返回一个封装专业题数据的 `ProfessionalTest` 对象。如果该行有错误，则该方法引发一个 `DataFormatException`，其中包含格式错误的数据行。 
```java
private ProfessionalTest readProfessionalTest(String line)
    throws DataFormatException
```

4) 此方法将指定文件中的信息加载到试题库中并试题库。它首先打开文件然后读取并处理文件中的每一行。使用方法 `String.startsWith` 确定每行数据的行类型。
    - 如果行类型是 `EnglishTest`，则调用方法 `readEnglishTest`。
    - 如果行类型是 `MathTest`，则调用方法 `readMathTest`。
    - 如果行类型是 `ProfessionalTest`，则调用方法 `readProfessionalTest`。

    处理完该行后，`loadTestDatabase` 将试题添加到试题库中。此方法可能引发以下异常：
    - `FileNotFoundException` — 如果指定的文件不存在。
    - `IOException` — 如果读取指定文件中的信息时出错。
    - `DataFormatException` — 如果文件中的某行有错误（异常应包含格式错误的数据行）。
        
     ```java
        public TestDatabase loadTestDatabase (String filename)
            throws FileNotFoundException, 
            IOException,
            DataFormatException
    ```


#### 类 `FushiSystem`
`writeFile` 方法使用指定的名称创建一个新文件，将指定的字符串写入该文件，然后关闭该文件。
其他方法可直接在实验 Unit3-2 上进行更改或直接沿用 Unit3-2 中的方法。

## 任务
1. 根据题目需求实现复试系统，请添加必要的注释。
2. 将试题数据文件路径配置到程序运行参数中。
3. 与 Unit3-2 相同，系统会提示选项列表，供用户选择需要输出的格式。当用户选择特定的格式后，系统会创建相应的包含学生试卷信息的文件。
4. 实验需要写一个简单的说明文档，其中包括必要的运行说明及运行结果截图。其中包括系统对不同错误的处理反馈。
5. 实验提交内容：项目文件及说明文档。
6. 实验的输出结果必须和下面展示的结果一致。(此处学生试卷信息与 Unit3-2 不同，请注意！)

### 纯文本
如果用户以纯文本保存学生试卷信息（包含学生试卷的试题编号），则应创建包含以下内容的文件：
```
Student Catalog
2019213001_Wu Guangsheng_P008_P007_P004_E008_E010_P003_E001_M006_M007_M005
2019213002_Chen Shengdian_E008_E005_M003_P003_E002_P004_M010_P007_M007_P008
2019213003_Liu Zihao_M007_P002_P010_M005_E007_M006_P009_E004_P006_E008
2019213004_Chou Li_E009_E007_M008_M010_P004_M001_E002_P005_P003_P002
2019213005_Zheng Xize_E007_E004_M002_P008_P005_E006_M009_M010_P003_P002
2019213006_Li Mengqi_M005_E009_P006_M004_M009_P010_E006_E002_P005_P004
2019213007_Wang Zhi_E005_M002_E009_M009_P004_P006_M007_P002_E002_P007
...
```

### HTML
如果用户以 HTML 保存学生试卷信息，则应创建包含以下内容的文件：
```html
<html>
	<body>
		<center><h2>Student Catalog</h2></center>
		<hr/>
		<h4>2019213001 Wu Guangsheng</h4>
		<blockquote>
			M007|Find the differential equation of the following function.|3|Clear problem solving process and correct value|no image|Find the value of the constant b and the differential equation<br/>
			E008|Translate to Chinese|3|Complete translation|E-C<br/>
			M010|Find the function f(x).|2|Right|http://image.com/m009|no<br/>
			E003|Choose the correct answer based on the content being played.|3|Correct answer|Hearing<br/>
			P008|The time complexity of the following code is?|1|Right|no|no|http://image.com/p008<br/>
			M003|Find the differential equation of the following function.|3|Necessary problem-solving process|no image|The first step is to find the integral. The second step is to find the value of the constant c.<br/>
			E010|Translate the following text into English.|2|Use the correct words and smooth|C-E<br/>
			P005|The design of the database includes two aspects of design content, they are?|2|Similar in meaning|no|no|no image<br/>
			P002|Fill in the following blanks to realize the calculation of the sum of the numbers between 1-200 that are not divisible by 5.|2|Correct result at run|Fill in the code in the blank.|no|http://image.com/p002<br/>
			P010|Enter 5 numbers to find their maximum and average.|3|Correct result at run|Time complexity cannot exceed n.)|no|no image<br/>
		</blockquote>
		<hr/>
		<h4>2019213002 Chen Shengdian</h4>
		<blockquote>
			E004|Translate the following Chinese in English.|2|No grammatical errors|C-E<br/>
			P005|The design of the database includes two aspects of design content, they are?|2|Similar in meaning|no|no|no image<br/>
			M005|Several extreme points in the figure below.|3|Right|http://image.com/m005|no<br/>
			M009|Find general solutions of differential equations.|2|The parameters are correct|no image|Find the value of the parameter<br/>
			P001|What are the characteristics of JAVA language?|1|Right|Name at least three of the characteristics|no|no image<br/>
			E006|Choose the correct answer based on contextual dialogue|2|Right|Hearing<br/>
			E008|Translate to Chinese|3|Complete translation|E-C<br/>
			P008|The time complexity of the following code is?|1|Right|no|no|http://image.com/p008<br/>
			M002|Which of the following series converge?|3|Right|no image|no<br/>
			P009|Benefits of thread pool.|3|Can name the key benefits|no|no|no image<br/>
		</blockquote>
		<hr/>
...
</body>
</html>
```

### XML
如果用户以 XML 保存学生试卷信息，则应创建包含以下内容的文件：
```xml
<StudentCatalog>
  <student id="2019213001" name="Wu Guangsheng">
    <ExamPaper>
      <Test code="P008">The time complexity of the following code is?</Test>
      <Test code="P007">The difference between process and thread.</Test>
      <Test code="P004">The idea of dynamic programming</Test>
      <Test code="E008">Translate to Chinese</Test>
      <Test code="E010">Translate the following text into English.</Test>
      <Test code="P003">The time complexity of the algorithm refers to?</Test>
      <Test code="E001">Translate the following text into English.</Test>
      <Test code="M006">Find the inflection points of the following functions.</Test>
      <Test code="M007">Find the differential equation of the following function.</Test>
      <Test code="M005">Several extreme points in the figure below.</Test>
    </ExamPaper>
  </Student>
  <student id="2019213002" name="Chen Shengdian">
    <ExamPaper>
      <Test code="E008">Translate to Chinese</Test>
      <Test code="E005">Translate the following English in Chinese.</Test>
      <Test code="M003">Find the differential equation of the following function.</Test>
      <Test code="P003">The time complexity of the algorithm refers to?</Test>
      <Test code="E002">Translate the following article content.</Test>
      <Test code="P004">The idea of dynamic programming</Test>
      <Test code="M010">Find the function f(x).</Test>
      <Test code="P007">The difference between process and thread.</Test>
      <Test code="M007">Find the differential equation of the following function.</Test>
      <Test code="P008">The time complexity of the following code is?</Test>
</ExamPaper>
  </Student>
...
</StudentCatalog>
```
