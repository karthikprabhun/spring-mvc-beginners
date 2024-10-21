<!DOCTYPE html>
<html>
<head>
    <title>Form</title>
</head>
<body>
    <form id="userForm">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required>
        <br>
        <label for="age">Age:</label>
        <input type="number" id="age" name="age" required>
        <br>
          <br>
        <label for="age">Course:</label>
        <input type="text" id="course" name="course" required>
        <br>
        
        <input type="submit" value="Submit">
    </form>
    
    
    <h1>${responseText}</h1>


    <script>
        document.getElementById('userForm').onsubmit = async function(event) {
            event.preventDefault(); // Prevent the default form submission

            const name = document.getElementById('name').value;
            const age = document.getElementById('age').value;
            const age = document.getElementById('course').value;

            const response = await fetch('/submit', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json',
                },
                body: JSON.stringify({ name, age, course}), // Convert form data to JSON
            });

            const responseText = await response.text();
            alert(responseText); // Display the response
        };
    </script>
</body>
</html>
