<%@include file="/WEB-INF/include/taglibs.jspf" %>

<div class="row">
	<div class="large-12 columns text-center">
		<h5>Create TODO</h5>
	</div>
</div>
<div class="row">
	<div class="large-12 columns">
		<form:form method="POST" commandName="todo">
			<fieldset>
				<legend>TODO</legend>
				<div class="row">
					<div class="large-12 columns">
						<label>Description:</label>
						<form:input path="description" placeholder="Enter Todo Text"/>
					</div>
				</div>
				<div class="row">
				<input type="submit" value="Save" onclick="saveTodo()"/>
				</div>
			</fieldset>
		</form:form>
	</div>
</div>