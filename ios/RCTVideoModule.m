//
//  RCTVideoModule.m
//  VideoARPOC
//
//  Created by khoi anh on 06/04/2022.
//

#import <Foundation/Foundation.h>
// RCTCalendarModule.m
#import "RCTVideoModule.h"
#import <React/RCTLog.h>
#import "AppDelegate.h"

@implementation RCTVideoModule

RCT_EXPORT_MODULE(VideoPOCModule);

RCT_EXPORT_METHOD(joinChannel) {
  NSLog(@"RN binding - Native View - Loading MyViewController.swift");
  AppDelegate *appDelegate = (AppDelegate *)[UIApplication sharedApplication].delegate;
  [appDelegate goToNativeView];
}

@end
