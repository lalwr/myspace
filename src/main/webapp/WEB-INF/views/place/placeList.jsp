<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<script type="text/javascript">
    $(document).ready(function(){

    });
    function loadGrid() {
        window.location.href = "${contextPath}/places?" + $("#form").serialize();
    }
</script>
<title>장소 리스트</title>
<form id="form" name="form">
    <input type="hidden" id="page" name="page" value="">
    <div class="container">
        <div class="row">

                <div class="col-sm-4">
                    <div class="thumbnail">
                        <div class="caption">
                            <div></div>
                            <div></div>
                            <div></div>
                            <div></div>
                        </div>
                    </div>
                </div>

        </div>
    </div>
    <button type="button" class="btn btn-default" id="btnDetail">글 작성</button>
</form>
