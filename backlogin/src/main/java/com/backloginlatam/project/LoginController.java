package com.backloginlatam.project;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/login")
public class LoginController {

    public LoginController(){

    }

    @GetMapping("/access")
    public boolean acceso(@RequestParam(required = false) String usuario,
                          @RequestParam(required = false) String  password)
    {
        if(usuario!= null && password != null)
        {
            return true;
        }
        else {
            return false;
        }

    }
    @GetMapping("/accesss")
    public boolean access(@RequestBody LoginRequest loginRequest )
    {
        if(loginRequest.getUser()!= null && loginRequest.getPassword() != null)
        {
            return true;
        }
        else {
            return false;
        }

    }

}
