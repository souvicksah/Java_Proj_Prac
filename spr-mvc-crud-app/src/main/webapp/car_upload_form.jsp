<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Upload Page</title>
</head>
<body>
   <form action="car_upload.htm" method="post" enctype="multipart/form-data">
        <input type="hidden" name="id" value=<%=request.getParameter("id") %>>
         <div>
             <label>Select Image</label>
             <input type="file" name="image">
         </div>       
         <button type="submit">Upload</button>
   
   </form>
</body>
</html>