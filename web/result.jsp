<%-- 
    Document   : result
    Created on : Sep 14, 2016, 3:27:46 PM
    Author     : Jiaming
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!--Using the viewport meta tag to control layout on mobile browsers-->
        <meta name="viewport" content="width=device-width, initial-scale=1" />

        <!-- Bootstrap Core CSS -->
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <title>Hash Values</title>
    </head>
    <body>       

        <div class="container">
            <div class="row">
                <div class="col-xs-1"></div>
                <div class="col-xs-10">
                    <div class="page-header">
                        <h1>Compute Hash Result</h1>
                        <h1><small> Hash values in both two forms. </small></h1>

                    </div>

                    <div class="row">
                        <form method="get" action="redictToIndex">
                            <div class="form-group">
                                <!--<label for="hex" label-success>Hex:</label>-->

                                <div class="panel panel-default">
                                    <div class="panel-heading">Hash Function:</div>
                                    <div class="panel-body"><%= request.getParameter("hashFunction")%></div>
                                </div>

                            </div>
                            <div class="form-group">
                                <!--<label for="hex" label-success>Hex:</label>-->

                                <div class="panel panel-default">
                                    <div class="panel-heading">String:</div>
                                    <div class="panel-body"><%= request.getParameter("string")%></div>
                                </div>

                            </div>

                            <div class="form-group">
                                <div class="panel panel-success">
                                    <div class="panel-heading">Hex: </div>
                                    <div class="panel-body"><%= request.getAttribute("hex")%></div>
                                </div>
                            </div>

                            <div class="form-group">
                                <div class="panel panel-success">
                                    <div class="panel-heading">Base:</div>
                                    <div class="panel-body"><%= request.getAttribute("base")%></div>
                                </div>
                            </div>


                            <button type="submit" class="btn btn-default btn-block" id="back">Type in new String</button>
                        </form>

                    </div>
                    <div class="col-xs-1"></div>
                </div>
            </div>
            <footer class="footer navbar-fixed-bottom">
                <div class="container">
                    <p class="text-capitalize">Produced by Jiaming NI</p>
                </div>
            </footer>
            <!-- Bootstrap Core JavaScript -->
            <script src="js/bootstrap.min.js"></script>
    </body>
</html>
