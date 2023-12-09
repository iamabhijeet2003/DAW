<?php
session_start();
// define variables and set to empty values
$pageTitle = "Login";
$autor = "Ricardo";

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

include __DIR__."/parts/head.part.php";
?>


<body>
    <section>
        <div class="form-box">
          
            <p>Please, enter your email and password</p>
            <form method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]);?>">
            <label> E-mail: <br>
            <input type="text" name="email" value="<?= $email;?>"> <span
            ,→ class="error"> <?= $emailErr; ?> </span>
            </label>
            <label>Password: <br>
            <input type="password" name="pass" value="<?= $pass;?>"> <span
            ,→ class="error"> <?= $passErr; ?> </span>
            </label>
            <input type="submit" name="submit" value="Submit">
            </form>
        </div>
    
            
</section>

<?php 
    include __DIR__.("/parts/footer.part.php");
?>
</body>

</html>

