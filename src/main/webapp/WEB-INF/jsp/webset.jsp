<%@ page language="java" contentType="text/html;charset=UTF-8"

         pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTDHTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>图书馆座位预定系统</title>
    <link href="./bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="css/rightmain.css">

</head>
<body>


<div class="iframecontent">

    <div class="itabcontent" id="itabcontent">

        <!--站点配置开始-->
        <div class="itabcontentlist zdpz">
            <dl class="clearfix">
                <dt>姓名：</dt>
                <dd>
                    <input id="userName" type="text" value="${user.userName}" readonly="true"/>
                </dd>
            </dl>
            <dl class="clearfix">
                <dt>学号：</dt>
                <dd>
                    <input id="stuNumber" type="text" value="${user.userSutId}" readonly="true"/>
                </dd>
            </dl>
            <dl class="clearfix">
                <dt>邮箱：</dt>
                <dd>
                    <input id="email" type="text" value="${user.userEmail}" readonly="true"/>
                </dd>
            </dl>
            <dl class="clearfix">
                <dt>专业：</dt>
                <dd>
                    <input id="major" type="text" value="${user.userMajor}" readonly="true"/>
                </dd>
            </dl>
            <dl class="clearfix">
                <dt>学院：</dt>
                <dd>
                    <input id="college" type="text" value="${user.userCollege}" readonly="true"/>
                </dd>
            </dl>
            <dl class="clearfix">
                <dt>手机号：</dt>
                <dd>
                    <input id="phone" type="text" value="${user.userPhoneNumber}" readonly="true"/>

                </dd>
            </dl>
            <dl class="clearfix">
                <dt>创建时间：</dt>
                <dd>
                    <input id="createDate" type="text" value="${user.userCreateTime}" readonly="true"/>
                </dd>
            </dl>

        </div>
        <!--站点配置结束-->

    </div>
</div>

</div>

<script src="./public/js/jquery-3.1.1.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="./bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript">
    //alert($)

    $(function(){
        $("#itab ul li").click(function(){
            var _id = $(this).index();

            $(this).addClass('current-item').siblings().removeClass('current-item');
            $('#itabcontent').children('.itabcontentlist').eq(_id).fadeIn('fast').siblings('.itabcontentlist').css('display','none');
        });

    })
</script>
</body>
</html>