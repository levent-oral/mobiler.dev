//
//  ViewController.m
//  AppObjC
//
//  Created by Levent Oral on 24.12.2020.
//

#import "ViewController.h"

@interface ViewController ()

@end

@implementation ViewController

- (void)viewDidLoad {
    [super viewDidLoad];
    // Do any additional setup after loading the view.
    
    MobilerDevSDK *mobilerDevSDK = [[MobilerDevSDK alloc] init];
    NSLog(@"%@", [mobilerDevSDK testMethod]);
}

@end
