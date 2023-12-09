<?php

    $users = array(
        "username1" => "password1",
        "username2" => "password2",
        "username3" => "password3"
    );

    
    




if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    
    $submittedUsername = $_POST['username'];
    $submittedPassword = $_POST['passwd'];

    // Check if the username and password are empty
    if (empty($submittedUsername) || empty($submittedPassword)) {
        echo "Please introduce your username and password. <a href='form.php'>Go back</a>";
    } else {
        // Check if the submitted user exists in the array
        if (array_key_exists($submittedUsername, $users)) {
            // Check if the submitted password matches the one in the array
            if ($users[$submittedUsername] === $submittedPassword) {
                // User exists and password is correct
                // Get the selected language
                $selectedLanguage = $_POST['idioma'];

                switch($selectedLanguage){
                    case "Castellano":
                        echo "Bienvenido! Has seleccionado $selectedLanguage.<a href='form.php'>Ir al formulario</a>";
                        break;
                    case "Valenciano":
                        echo "Benvingut! Has seleccionat $selectedLanguage. <a href='form.php'>Anar al formulari</a>";
                        break;
                    case "English":
                        echo "Welcome! You selected $selectedLanguage. <a href='form.php'>Go back</a>";
                    default:
                        echo "No has seleccinado la idioma.";
                }
                // Display a welcome message in the selected language
                //echo "Welcome! You selected $selectedLanguage. <a href='form.php'>Go back</a>";
            } else {
                // User exists, but the password is incorrect
                echo "The password is incorrect. <a href='form.php'>Go back</a>";
            }
        } else {
            // User doesn't exist in the array
            echo "The user doesn't exist. <a href='form.php'>Go back</a>";
        }
    }
} else {
    // Form not submitted
    echo "Please go to the main page and enter your username and password. <a href='form.php'>Go back</a>";
}

?>