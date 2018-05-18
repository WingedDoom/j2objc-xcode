//
//  ViewController.swift
//  J2ObjC-quadratic-equations
//
//  Created by Bulat Khabirov on 18.05.2018.
//  Copyright © 2018 Bulat Khabirov. All rights reserved.
//

import UIKit

class ViewController: UIViewController {
    @IBOutlet weak var aField: UITextField!
    @IBOutlet weak var bField: UITextField!
    @IBOutlet weak var cField: UITextField!
    @IBOutlet weak var answerLabel: UILabel!
    
    var a: Double?
    var b: Double?
    var c: Double?
    
    @IBAction func didTapSolveButton(_ sender: UIBarButtonItem) {
        guard let a = a, let b = b, let c = c else { return }
        
        let equation = QEEquation(double: a, with: b, with: c)!
        
        guard let solution = equation.solve() else {
            answerLabel.text = "The equation has no roots"
            return
        }
        
        answerLabel.text = solution.description__()
    }
    
    @IBAction func didChangeInput(_ sender: UITextField) {
        guard let text = sender.text else { return }
        
        let input = Double(text)
        
        switch sender {
        case aField:
            a = input
        case bField:
            b = input
        case cField:
            c = input
        default:
            break
        }
        
        if a != nil, b != nil, c != nil {
            answerLabel.text = "Tap \"Solve\" to get the solution"
        } else {
            answerLabel.text = "Waiting for inputs"
        }
    }
}

