package com.example.ob_ejSpring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    /**
     * Mensaje Hola mundo
     * http://localhost:8081/hola
     * @return
     */
    @GetMapping("/hola")
    public String holamundo(){
        return "¡Hola mundo!";
    }

    @GetMapping("/")
    public String home() {
        return """
                		<html>
                    <head>
                        <meta description="Api en Spring de Diabolik">
                        <title>Diabolik Home</title>
                        <style>
                            .foot{
                                position: absolute;
                                text-align: center;
                                width: 99%;
                                bottom: 20px;
                            }
                        </style>
                    </head>
                    <body>
                    <ul>
                        <li><a href="/hola" target="Hola Mundo" class="list">hola()</a></li>
                		<li><a href="/api/users" target="findall" class="list">findAll()</a></li>
                		<ul>
                            <li><a href="/api/users/1" target="findOnById" class="list">findOnById()</a></li>
                        </ul>
                		<li><a href="/easteregg" target="easteregg" class="list">OnlyOneUserCanSeeThis</a></li>
                	</ul>

                         <footer class="foot">
                            Copyright &copy; Proyecto Open BootCamp Davide Pietro Fragnito
                        </footer>
                    </body>

                </html>
                		""";
    }


    /**
     * Easter egg message
     * http://localhost:8081/easteregg
     * @return
     */
    @GetMapping("/easteregg")
    public String imprimirSaludo(){
        return """
                <html>
                    <head>
                        <meta description="Api en Spring de Diabolik">
                        <title>Diabolik</title>
                        <style>
                            .foot{
                                position: absolute;
                                text-align: center;
                                width: 99%;
                                bottom: 20px;
                            }
                        </style>
                    </head>
                    <body>
                        <h1><font color="D8320E">Welcome to Easter Egg Page</font></h1>
                        <img src="https://github.com/Diabolik90/Diabolik90/blob/main/DbK_render.png?raw=true" \s
                         title="Logo DBK">
                                
                         <footer class="foot">
                            Copyright &copy; Proyecto Open BootCamp Davide Pietro Fragnito
                        </footer>
                    </body>
                </html>
                """;

    }

}
