# 题目 2 — GUI
## 准备工作
在开始本练习之前，您需要精通以下知识：
- Swing 组件和容器的知识
- Swing 事件处理知识
- 了解 `JFileChooser` 对话框
目的：通过事件处理增强您创建 GUI 的能力
结果：您将掌握以下技能：
- 生产使用S wing GUI 的交互式应用程序
## 背景
在此作业中，您将为复试系统创建一个全面的 GUI。部分工作已为您完成，并在学生档案中提供。您将实现处理按钮事件的代码。
## 描述
类 FushiSystemGUI 实现了 Fushi System 的 GUI。此 GUI 使用户可以查看所有学生，为学生生成试卷并显示所有学生的试卷信息：
![](https://img04.sogoucdn.com/app/a/100520146/0f5354cc9c8211d514e719b295ae0b8d)
GUI 分为两个面板：`学生目录` 和 `学生试卷信息`：
- 「学生目录」面板包含学生的 id 和 name。该面板正下方是一个按钮，用于为列表中选中的学生生成试卷。
- 「学生试卷信息」面板包含一个文本区域，用于显示消息和学生试卷信息；命令按钮显示和保存学生试卷信息；单选按钮以指定学生试卷信息在显示或保存时的格式。

当用户单击以下命令按钮之一时，FushiSystemGUI 将按如下所述处理关联的事件：
- generateExamPaperButton
  为所选学生生成试卷。如果所选学生已经为其生成过试卷，显示提示信息。
- displayExamPaperButton
  显示所有学生的试卷信息。
- saveExamPaperButton
  将所有学生的试卷信息保存在文件中，没有试卷的学生会显示「该学生还没有为其生成试卷！」。

当用户单击以下单选按钮之一时，FushiSystemGUI 将按如下所述处理关联的事件：
- plainRadioButton
  将学生试卷信息的格式更改为纯文本。
- HTMLRadioButton
  将学生试卷信息的格式更改为 HTML。
- XMLRadioButton
  将学生试卷信息的格式更改为 XML。

当用户在以下列表中选择一个元素时，FushiSystemGUI 将按如下所述处理关联的事件：
- catalogList
  返回所选学生对象，获得学生的信息。

FushiSystemGUI定义了以下 Swing 组件：
- catalogList
  显示学生列表中每个学生的 id 和 name。
- generateExamPaperButton
  为学生生成试卷按钮。
- displayExamPaperButton
  显示学生试卷信息按钮。
- saveExamPaperButton
  保存学生试卷信息按钮。
- statusTestArea
  显示学生试卷信息文本框。 
- fileChooser
  一个 JFileChooser 对象。允许用户指定将保存学生试卷信息的文件的名称和位置。单击 Save ExamPaper 按钮时，将显示此对话框。

FushiSystemGUI 定义以下实例变量：
- studentCatalog
  包含所有学生的目录对象。
- testDatabase
  一个包含所有 `Test` 的对象。
- studentsFormatter。
  一个 `StudentsFormatter` 对象，指定显示或保存学生试卷信息时要使用的格式。

按钮事件是使用类 FushiSystemGUI 中的命名内部类处理的。以下内部类是完整的，不应修改：
- DisplayStudentListener。 
  学生列表的侦听器。
- GenerateExamPaperListener。
  按钮 Generate ExamPaper 的侦听器。
- PlainListener。
  单选按钮 Plain 的侦听器。
- HTMLListener。
  单选按钮 HTML 的侦听器。
- XMLListener。
  单选按钮 XML 的侦听器。
- DisplayExamPaperListener。
  按钮 Display ExamPaper 的侦听器。
- SaveExamPaperListener。
  按钮 Save ExamPaper 的侦听器。

在此次作业中，您应该完成以下内部类的实现：
- DisplayExamPaperListener。
  按钮 Display ExamPaper 的侦听器。
- SaveExamPaperListener。
  按钮 Save ExamPaper 的侦听器。

## 文件
需要以下文件来完成此任务：
- `示例/FushiSystemGUI.jar`。
  下载此文件。它是示例可执行文件。
- `student-files`。下载此文件。该档案包含以下内容：
  - Class 文件
    - TestDatabase.class
    - FushiTestDatabaseLoader.class
    - StudentCatalog.class
    - Test.class
    - DataFormatException.class
    - FileFushiTestDatabaseLoader.class
    - HTMLStudentsFormatter.class 
    - ExamPaper.class
    - PlainTextStudentsFormatter.class 
    - TestItem.class
    - EnglishTest.class
    - MathTest.class
    - ProfessionalTest.class
    - Student.class
    - StudentFormatter.class
    - XMLStudentsFormatter.class 
  - Java文件
    - FushiSystemGUI.java。 使用此模板可完成您的实现。
  -	用于测试驱动程序的数据文件
  -	testCatalog.dat。试题库中包含每道试题的试题信息文件

## 任务
完成 `DisplayExamPaperListener` 和 `SaveExamPaperListener` 的实现。这些内部类在状态区域中显示的消息应与示例可执行文件显示的消息匹配。
遵循 Sun 的代码约定。以下步骤将指导您完成此作业。逐步工作并测试每个增量。经常保存。
1. 通过在命令提示符处发出以下命令来运行示例可执行文件：
```
java -jar FushiSystemGUI.jar
```
2. 添加外部类文件夹。
3. 然后在内部类 `DisplayExamPaperListener` 中实现方法 `actionPerformed`：在 `statusTextArea` 中显示学生试卷信息。信息应以单选按钮选择指示的格式显示。您将在类别 `StudentsFormatter` 中使用 `formatStudents`。
4. 接下来，在内部类 `SaveExamPaperListener` 中实现方法 `actionPerformed`：将学生试卷信息保存在文件中。首先打开文件选择器，以便用户可以指定将保存学生试卷信息的文件的名称和位置。接下来，将学生试卷信息保存在指定的文件中。该文件应以单选按钮选择指示的格式保存。最后，在状态区域中显示状态消息。
5. 最后编译并执行类 FushiSystemGUI。








