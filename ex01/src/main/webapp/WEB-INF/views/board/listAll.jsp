<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ include file="/WEB-INF/views/include/header.jsp" %>

<script>
	var result = '${msg}';
	if(result == 'SUCCESS') {
		alert("처리가 완료되었습니다.");
	}
</script>

<table class="table table-bordered">
	<tr>
		<th style="width:10px">BNO</th>
		<th>TITLE</th>
		<th>WRITER</th>
		<th>REGDATE</th>
		<th style="width:40px">VIEWCNT</th>
	</tr>
</table>

<%@ include file="/WEB-INF/views/include/footer.jsp" %>