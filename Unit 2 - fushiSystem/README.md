# Unit 1 复试系统
* 根据目前所学课堂内容，用 JAVA 逐步编程实现下述类图，遵循 Java 编程规范，并为撰写的类提供相应的 Javadoc 注释。

![](https://img03.sogoucdn.com/app/a/100520146/d260cb37e153f64ac9e9e2c752290f99)
* 在 `FushiSystem.java` 中已提供部分辅助函数，该类的其它方法，请按上述类图中的要求全部编程实现，最终保证程序在步骤 1-7 中的执行中，按要求完成功能。<br>程序运行时可供用户选择要实现的功能，如下图。(此功能已经给出，无需更改)

![](https://img01.sogoucdn.com/app/a/100520146/a7b7e2dff1bcf86c51c302f819b0f72e)
## 步骤 1 - 选择 1（`addStudentToCatalog` 方法）实现的功能
添加学生，逐步让用户输入以下内容，包括学生的 `id` 和 `name`，添加成功会提示用户相应信息。

![](https://img02.sogoucdn.com/app/a/100520146/e1aa3aa26161e9b02f93ca8a380021ad)

## 步骤 2 - 选择 2（`displayStudentCatalog` 方法）实现的功能
显示学生目录，包括学生的 `id` 和 `name`，格式如下：

![](https://img02.sogoucdn.com/app/a/100520146/19c48a4314b7de241d63febf4e1e0c56)

## 步骤 3 - 选择 3（`displayExamPaper` 方法）实现的功能
* 根据用户输入的学生 `id`，显示该学生的试卷信息，格式如下：

![](https://img04.sogoucdn.com/app/a/100520146/9a334d6341b8f4880c7f75c30054a5ac)
* 当用户输入不存在的学生 `id` 时，提示错误并请用户重新输入。
* 如果还未为该学生生成试卷，会提示用户「还没有为该学生生成相应的试卷」。

![](https://img04.sogoucdn.com/app/a/100520146/48c6630c56ab11d8d855567cc2b8151c)
 
## 步骤 4 - 选择 6（`lookupTotalScore` 方法）实现的功能
* 根据用户输入的学生 `id`，显示学生复试试卷的总得分，格式如下：

![](https://img03.sogoucdn.com/app/a/100520146/7782f0bc8a10d0e4fdf09b27ef90d901)
* 当用户输入不存在的学生 `id` 时，提示错误并请用户重新输入。
* 如果还未为该学生生成试卷，会提示用户「还没有为该学生生成相应的试卷」。

![](https://img03.sogoucdn.com/app/a/100520146/1ad790b409fa67a3722314f7105deb89)
 
## 步骤 5 - 选择 7（`lookupTestScore` 方法）实现的功能
* 根据用户输入的学生 `id`，显示学生复试试卷的每道题目得分，格式如下：

![](https://img02.sogoucdn.com/app/a/100520146/5384d841afa42ca487d193aaa32b5010)
* 当用户输入不存在的学生 `id` 时，提示错误并请用户重新输入。
* 如果还未为该学生生成试卷，会提示用户「还没有为该学生生成相应的试卷」。

![](https://img01.sogoucdn.com/app/a/100520146/0e9d0be969d5a2da10cda232dae637d5)
 