package com.empresa.app.servicioAlq.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.app.servicioAlq.models.entity.DtoAlquiler;
import com.empresa.app.servicioAlq.models.entity.DtoUsuario;
import com.empresa.app.servicioAlq.models.entity.Usuarios;
import com.empresa.app.servicioAlq.models.service.Usuarios.IUsuariosService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class LoginController {

    @Autowired
    private IUsuariosService iUsuariosService;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody DtoUsuario datos, HttpServletRequest request) {
        // Lógica de autenticación

        String user = datos.getUsuario();

        String pass = datos.getClave();

        if (iUsuariosService.findByUsuarioAndClave(user, pass)) {
            HttpSession session = request.getSession();

            session.setAttribute("user", "usuario");

            return ResponseEntity.ok("Login exitoso");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Error de autenticación");
        }
    }

    @GetMapping("/isAuthenticated")
    public ResponseEntity<Boolean> isAuthenticated(HttpServletRequest request) {
        HttpSession session = request.getSession();
        boolean isAuthenticated = session.getAttribute("user") != null;
        return ResponseEntity.ok(isAuthenticated);
    }

    // @GetMapping("/user")
    // public ResponseEntity<Usuarios> getUser(HttpServletRequest request) {
    // HttpSession session = request.getSession();
    // String username = (String) session.getAttribute("user");

    // if (username != null) {
    // // Recuperar los datos del usuario desde el repositorio o servicio
    // Usuarios user = userRepository.findByUsername(username);
    // return ResponseEntity.ok(user);
    // } else {
    // return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
    // }
    // }

    @PostMapping("/logout")
    public ResponseEntity<String> logout(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.invalidate();
        return ResponseEntity.ok("Logout exitoso");
    }

}
