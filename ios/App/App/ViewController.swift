//
//  ViewController.swift
//  App
//
//  Created by Levent Oral on 24.12.2020.
//

import UIKit
import MobilerDevSDK

class ViewController: UIViewController {

    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
        
        let mobilerDevSDK = MobilerDevSDK()
        print(mobilerDevSDK.testMethod())
    }
}

