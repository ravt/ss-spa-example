<%@include file="/WEB-INF/include/taglibs.jspf" %>

<div class="row">
	<div class="large-12 columns text-center">
		<h5>My TODO List</h5>
	</div>
</div>
<div class="row">
	<div class="large-12 columns">
		<div id="todoList">
			<ul>
				<c:forEach var="todo" items="${todoList}">
					<li><c:out value="${todo.description}"/></li>
				</c:forEach>
			</ul>
		</div>
	</div>
</div>