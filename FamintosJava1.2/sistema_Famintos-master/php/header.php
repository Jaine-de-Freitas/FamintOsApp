<header class="cabecalho">
        <a href="index.php"><img id="logo" src="../estetica_imgs/famintosf.png"></a>
        <nav id="links">
            <ul id="lista">
                <li class="item" id="i1"><a class="menu" href="index.php" style="color:inherit;"><span class="glyphicon glyphicon-home"> Home</span></a></li>
                <li class="item" id="i2"><a class="menu" href="cardapio.php" style="color:inherit;"><span class="glyphicon glyphicon-apple"> Cardápio </span></a></li>
                <li class="item" id="i3"><a class="menu" href="carrinho.php?cd=0" style="color:inherit;"><span class="glyphicon glyphicon-shopping-cart"> Carrinho</span></a></li>

                <?php if(empty($_SESSION['ID'])) { ?>
                    <li class="item"><a class="menu" href="login.php" style="text-decoration:none;color:inherit;"><span class="glyphicon glyphicon-log-in"> Login</span></a></li>
                <?php } else {

                    if($_SESSION['Status'] == 0) {
                        $consulta_usuario = $cn->query("select nm_usuario from tbl_usuario where cd_usuario = '$_SESSION[ID]'");
                        $exibe_usuario = $consulta_usuario->fetch(PDO::FETCH_ASSOC);
                    ?>
                    <li class="item"><span class="glyphicon glyphicon-user"> <?php echo mb_strimwidth($exibe_usuario['nm_usuario'],0,20,'...'); ?><span></a></li>
                    <li class="item"><a class="menu" href="sair.php" style="text-decoration:none;color:inherit;"><span class="glyphicon glyphicon-log-out"> Sair</span></a></li>
                    <?php } else {?>
                        <li class="item"><a href="adm.php"><button class="btn btn-sm btn-danger">Administrador</button></a></li>
                    <li class="item"><a class="menu" href="sair.php" style="text-decoration:none;color:inherit;"><span class="glyphicon glyphicon-log-out"> Sair</span></a></li>
                <?php } }?>
            </ul>
        </nav>
    </header>