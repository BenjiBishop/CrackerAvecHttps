<?php 
if(isset($_GET["pwd"])){ 
if($_GET["pwd"]=="aaadc"){
     echo"successfully hacked";
}
else{
    echo"error";

}

?>
<?php }else { ?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="" method="GET">
        <input type="password" name="pwd">
        <input type="submit" value="valider">
    </form>
</body>
</html>
<?php } ?>