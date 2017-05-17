<%@ page language="java" contentType="text/html;charset=UTF-8"

         pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTDHTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html lang="zh-cn">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>订单列表</title>

    <!-- Bootstrap -->
    <link href="./bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <!-- <link rel="stylesheet" type="text/css" href="css/index.css"> -->
    <link rel="stylesheet" type="text/css" href="css/rightmain.css">
  </head>
  <body>
      <div class="iframecontent">
        <div class="pos">
         <i class="icoh"></i>
          <span>历史订单</span>
        </div>
        <div class="operate">
          <%--<div class="pull-left">--%>
            <%--<input type="button" name="" value="添加栏目" class="btn  btn-success">--%>
            <%--<input type="button" name="" value="更新排序" class="btn btn-danger">--%>
          <%--</div>--%>
          <!-- operate标题结束 -->
          <div class="list">
            <div class="tablewrap">
              <table class="table" width="100%" id="datalist">
                <thead>
                  <tr>

                    <th>订单编号</th>
                    <th>座位号</th>
                    <th>订单时间</th>
                    <th>订单状态</th>
                  </tr>
                </thead>
                <tbody>


                  <c:forEach var="obj" items="${recordList}">

                      <tr>

                          <td>${obj.recordId}</td>
                          <td>${obj.recordDeskId}</td>
                          <td>${obj.recordDate}</td>
                          <td>${obj.recordState}</td>


                      </tr>
                  </c:forEach>
                </tbody>
              </table>
            </div>

          </div>
          
        </div>
      </div>


      <script src="./public/js/jquery-3.1.1.js"></script>
      <!-- Include all compiled plugins (below), or include individual files as needed -->
      <script src="./bootstrap/js/bootstrap.min.js"></script>
      <script type="text/javascript">
      //alert($)
      //复选框全部选中
      $(function(){
        $("#all").click(function(){
          if($(this).prop('checked')){
            $('#datalist :checkbox').prop('checked',true)
          }else{
            $('#datalist :checkbox').prop('checked',false)
          }
        })
      })
      </script>
  </body>
</html>