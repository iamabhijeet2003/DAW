<?php
session_start();
// define variables and set to empty values

$email = $pass = "";
$emailErr = $passErr = "";
$err = false;
if ($_SERVER["REQUEST_METHOD"] == "POST") {

    if (empty($_POST['email'])) {
        $emailErr = "* Email is required";
        $err = true;
    } else {
        $email = trim(strip_tags($_POST['email']));
        $_SESSION['email'] = $email;
        //Check if the email is well formed
        if (!filter_var($email, FILTER_VALIDATE_EMAIL)) {
            $emailErr = "* Invalid email format";
            $err = true;
        }
    }
    if (empty($_POST['pass'])) {
        $passErr = "* Password is required";
        $err = true;
    } else {
        $pass = trim(strip_tags($_POST['pass']));
        $_SESSION['pass'] = $pass;
        if (strlen($pass) < 8) {
            $passErr = "* The password must have at least 8 characters";
            $err = true;
        }
    }

    
}else{
    $err = true;
}


if (!$err) {
        header("Location:checkuser.php");
    }


?>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="style.css">
</head>

<body>
    <section>
        <div class="form-box">
            <div class="form-value">
                <h1>Login</h1>
                <p>Please, enter your email and password</p>

                <form method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]);?>">
                <div class="inputbox">
                    <label> E-mail: <br>
                    <input type="text" name="email" value="<?= $email;?>"> <span
                    ,→ class="error"> <?= $emailErr; ?> </span>
                    </label>
                </div>
                <div class="inputbox">
                    <label>Password: <br>
                <input type="password" name="pass" value="<?= $pass;?>"> <span
                ,→ class="error"> <?= $passErr; ?> </span>
                </label>
                </div>
                
                <div class="register">
                    <input type="submit" name="submit" value="Submit">
                </div>
                
                </form>
            </div>
        </div>
    
            
</section>
</body>

</html>
