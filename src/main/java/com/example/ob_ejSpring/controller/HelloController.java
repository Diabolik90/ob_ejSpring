package com.example.ob_ejSpring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

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
