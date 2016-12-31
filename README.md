# DS-Project1-HashFunction
Simple Web based HashFunction Application using MVC framework.  #Java #Bootstrap

一个简单的 web application 实现以下功能：
1. 用户输入一个字符串，并可以选择 MD5 或者 SHA-1 作为哈希算法 <br>
2. 点击提交，得到哈希结果 <br>

采用 MVC 模式：<br>
1. Model 中写完成哈希算法的流程 <br>
2. View 用 JSP 完成 <br>:
    index.jsp 页面来提交字符串. <br>
    result.jsp 页面来展示哈希结果. <br>
3. Controller 中写 Servlet<br>
    在 doGet 方法中接收字符串，并调用 Model 中的处理逻辑<br>
