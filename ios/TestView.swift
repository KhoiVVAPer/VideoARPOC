//
//  TestView.swift
//  VideoARPOC
//
//  Created by khoi anh on 06/04/2022.
//

import Foundation
import UIKit


class VideoPlayerView: UIView {
  weak var videoPlayerVC: VideoPOCViewController?//1
  
  @objc var stringULValue: String = "" {
    didSet {
      setNeedsLayout()
    }
  }
  override init(frame: CGRect) {
    super.init(frame: frame)
  }
  required init?(coder aDecoder: NSCoder) { fatalError("nope") }
  
  override func layoutSubviews() {//2
    super.layoutSubviews()
    if videoPlayerVC == nil {
      embed()
    } else {
      videoPlayerVC?.view.frame = bounds
    }
  }
  private func embed() {//3
    guard
    parentViewController != nil else {//4
      return
    }
  }
}


extension UIView {
    var parentViewController: UIViewController? {
        var parentResponder: UIResponder? = self
        while parentResponder != nil {
            parentResponder = parentResponder!.next
            if let viewController = parentResponder as? UIViewController {
                return viewController
            }
        }
        return nil
    }
}
