<%-- 
    Document   : create
    Created on : 14/05/2017, 02:35:43 PM
    Author     : Al3x
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

    <head>
       
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <link href="${pageContext.servletContext.contextPath}/css/style.css" rel="stylesheet">
        <title>${title}</title>
    </head>
    <body>
        
        <form>
            <header>Login</header>
            <label>Username <span>*</span></label>
            <input/>
            <div class="help">At least 6 character</div>
            <label>Password <span>*</span></label>
            <input/>
            <div class="help">Use upper and lowercase lettes as well</div>
            <button>Login</button>
        </form>
    </body>

