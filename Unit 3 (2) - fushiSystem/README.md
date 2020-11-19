# Unit 3-2
## 题目 1 — 策略模式和单一实例模式的运用
在本实验中，你将实现复试系统，该系统向用户提供四种选择：
![](https://img02.sogoucdn.com/app/a/100520146/e50ca11c864ff0d9b0a44eac53db8b63)
根据用户选择，系统能够以纯文本、HTML 或 XML 三种格式显示学生信息。
复试系统的部分类图如下：
![](https://img03.sogoucdn.com/app/a/100520146/d642dacd1b598ea963de12d949653775)
你需要实现接口 `StudentsFormatter`、类 `FushiSystem`、类 `PlainTextStudentsFormatter`、类 `HTMLStudentsFormatter`和类 `XMLStudentsFormatter`。请按照类图和下面的描述信息实现复试系统。部分代码已经实现，在 `FushiSystem` 文件夹中，这些类无需更改。你需要使用单例模式和策略模式来实现复试系统显示学生信息的代码。

### 类 `PlainTextStudentsFormatter`
方法 `formatStudents(StudentCatalog studentCatalog)` 以纯文本格式生成包含指定学生信息的字符串。

注意事项：    
1) 以下示例展示的是一个学生的信息，用此格式展示出学生目录中所有学生的信息。    
2) 为方便显示，只需显示出学生试卷中每个题目的编号，不必显示试题的具体信息。    

示例：
```
学生目录
学生 ID_学生姓名_题目 1 编号_题目 2 编号_题目 3 编号..._题目 9 编号_题目 10 编号
```
### 类 `HTMLStudentsFormatter`
方法 `formatStudents(StudentCatalog studentCatalog)` 以 HTML 格式生成包含指定学生信息的字符串。

注意事项：    
1) 不同学生信息之间用 `<hr>` 分割。    
2) 为方便显示，在展示学生试卷信息时，每个题目只需要展示出题目编号和题干内容。    
3) 包含汉字的 `<>` 中的内容需要根据具体学生显示具体信息。    

示例：
```html
<html>
  <body>
    <center><h2>学生目录</h2></center>
<hr>
<h4>学生ID  学生姓名</h4>
    <blockquote>
        <题目1编号> <题目1题干内容> <br>
        <题目2编号> <题目2题干内容> <br>
        ...
	    <题目10编号> <题目10题干内容> <br>
    </blockquote>
<hr>
<h4>学生ID  学生姓名</h4>
    <blockquote>
        <题目1编号> <题目1题干内容> <br>
        <题目2编号> <题目2题干内容> <br>
        ...
	    <题目10编号> <题目10题干内容> <br>
      </blockquote>
	   <hr>
...
<h4>学生ID  学生姓名</h4>
    <blockquote>
        <题目1编号> <题目1题干内容> <br>
        <题目2编号> <题目2题干内容> <br>
        ...
	    <题目10编号> <题目10题干内容> <br>
    </blockquote>
</body>
</html>
```

### 类 `XMLStudentsFormatter`
方法 `formatStudents(StudentCatalog studentCatalog)` 以 XML 格式生成包含指定学生信息的字符串。

注意事项：    
1) 为方便显示，在展示学生试卷信息时，每个题目只需要展示出题目编号和题干内容。    
2) 包含汉字的 `<>` 中的内容需要根据具体学生显示具体信息。    

示例：
```xml
<StudentCatalog>
    <student id="<学生 ID>" name="<学生姓名>">
        <ExamPaper>
            <Test code="<题目1编号>"><题目1题干内容></Test>
            <Test code="<题目2编号>"><题目2题干内容></Test>
            <Test code="<题目3编号>"><题目3题干内容></Test>
	        ...
            <Test code="<题目9编号>"><题目9题干内容></Test>
            <Test code="<题目10编号>"><题目10题干内容></Test>
        </ExamPaper>
    </Student>
...
    <student id="<学生 ID>" name="<学生姓名>">
        <ExamPaper>
            <Test code="<题目1编号>"><题目1题干内容></Test>
            <Test code="<题目2编号>"><题目2题干内容></Test>
            <Test code="<题目3编号>"><题目3题干内容></Test>
            ...
            <Test code="<题目9编号>"><题目9题干内容></Test>
            <Test code="<题目10编号>"><题目10题干内容></Test>
        </ExamPaper>
    </Student>
</StudentCatalog>
```

### 类 `FushiSystem`
类 `FushiSystem` 允许用户以三种格式之一显示学生信息：纯文本、HTML 或 XML。该类的实例变量和方法解释如下：

#### 实例变量：
- `studentCatalog`: 学生目录
- `testDatabase`: 试题库
- `studentsFormatter`: 引用当前格式化程序的引用变量：`PlainTextstudentsFormatter`、`HTMLstudentsFormatter` 或 `XMLstudentsFormatter` 对象。

#### 构造函数和方法: 
- `public static void main(String[] args) throws IOException`<br>启动应用程序
- `FushiSystem()`<br>初始化实例变量 `studentCatalog`、`testDatabase` 和 `studentsFormatter`
- `loadTestDatabase()`<br>填充试题库
- `loadStudent()`<br>填充学生目录
- `getChoice() throws IOException`<br>显示选项菜单并验证用户的选择
- `generateExamPaper(Student student)`<br>为指定学生生成试卷
- `setStudentsFormatter(StudentsFormatter newFormatter)`<br>通过使用参数 `newFormatter` 中指定的对象更新实例变量 `studentsFormatter` 来更改当前格式化程序。
- `displayStudents()`<br>使用方法 `studentsFormatter.formatStudents` 在控制台中显示学生信息。
- `run() throws IOException`<br>向用户显示选项菜单并执行所选任务。

#### 选项
- 如果用户选择选项 1，请运行类 `PlainTextStudentsFormatter` 的单例实例的 `setStudentsFormatter` 方法，并调用 displayStudents 方法以在控制台中显示销售信息。
- 如果用户选择选项 2，请运行类 `HTMLStudentsFormatter` 的单例实例的 `setStudentsFormatter` 方法，并调用displayStudents方法以在控制台中显示销售信息。
- 如果用户选择选项 3，请运行类 `XMLStudentsFormatter` 的单例实例的 `setStudentsFormatter` 方法，并调用displayStudents方法以在控制台中显示销售信息。

### 输出结果
- 如果用户选择以纯文本显示学生信息，则输出应为：
```
Student Catalog
201921300_吴广胜_E004_P008_E001_M003_M001_P004_M008_P005_P007_E003
2019213002_陈盛典_E008_M007_P002_M002_E007_P007_P006_E009_P003_M010
2019213003_刘子豪_M004_P002_P009_P007_M007_E005_M003_E006_P001_E002
2019213004_仇历_P004_P007_M004_P002_E003_E007_P009_M006_M001_E004
2019213005_郑西泽_P005_E007_P004_E004_P007_M006_M004_E009_P009_M001
```

- 如果用户选择以 HTML 格式显示学生信息，则输出应为：
```html
<html>
  <body>
    <center><h2>Student Catalog</h2></center>
    <hr>
    <h4>2019213001 吴广胜</h4>
      <blockquote>
         E004 Translate the following Chinese in English.<br>
         P008 The time complexity of the following code is?<br>
         E001 Translate the following text into English.<br>
         M003 Find the differential equation of the following function.<br>
         M001 Find the inflection points of the following functions.<br>
         P004 The number sequence bai is: 1,1,1,2,3,4,6,...<br>
         M008 The area enclosed by the following curve and the coordinate axis is?<br>
         P005 The design of the database includes two aspects of design content, they are?<br>
         P007 The difference between process and thread.<br>
         E003 Choose the correct answer based on the content being played.<br>
      </blockquote>
</body>
</html>
```

- 如果用户选择以XML格式显示学生信息，则输出应为：
```xml
<StudentCatalog>
  <student id="2019213001" name="吴广胜">
    <ExamPaper>
      <Test code="E004">Translate the following Chinese in English.</Test>
      <Test code="P008">The time complexity of the following code is?</Test>
      <Test code="E001">Translate the following text into English.</Test>
      <Test code="M003">Find the differential equation of the following function.</Test>
      <Test code="M001">Find the inflection points of the following functions.</Test>
      <Test code="P004">The number sequence bai is: 1,1,1,2,3,4,6,...</Test>
      <Test code="M008">The area enclosed by the following curve and the coordinate axis is?</Test>
      <Test code="P005">The design of the database includes two aspects of design content, they are?</Test>
      <Test code="P007">The difference between process and thread.</Test>
      <Test code="E003">Choose the correct answer based on the content being played.</Test>
    </ExamPaper>
  </Student>
</StudentCatalog>
```

## 题目 2 — 工厂模式运用
将题目 1 改为工厂模式的运用并实现。