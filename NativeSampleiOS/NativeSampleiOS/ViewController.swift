//
//  ViewController.swift
//  NativeSampleiOS
//
//  Created by Suita Fujino on 2019/02/23.
//  Copyright © 2019 Suita Fujino. All rights reserved.
//

import SharedCode
import UIKit

class ViewController: UIViewController {

    @IBOutlet weak var centerLabel: UILabel!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        
        centerLabel.text = CommonKt_.createApplicationScreenMessage()
    }


}

