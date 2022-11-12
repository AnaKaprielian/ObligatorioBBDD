package com.ucu.BBDD.controller;

import com.ucu.BBDD.entity.AppUser;
import com.ucu.BBDD.entity.Figure;
import com.ucu.BBDD.entity.FigurePK;
import com.ucu.BBDD.service.FigureService;
import com.ucu.BBDD.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FigureController {

    @Autowired
    private FigureService figureService;

    @PostMapping("/addFigure")
    public Figure addFigure(@RequestBody Figure figure){
        return figureService.saveFigure(figure);
    }


    @GetMapping("/figures")
    public List<Figure> findAllFigures(){
        return figureService.getFigures();
    }

    @DeleteMapping("/delete/{figurePK}")
    public String deleteUser(@PathVariable FigurePK figurePK){
        return figureService.deleteUser(figurePK);
    }
}
