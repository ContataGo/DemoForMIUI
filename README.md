# DemoForMIUI
这是一份用于演示MIUI系统全面屏与原生安卓功能“固定屏幕”之间产生的冲突。

该bug复现方式：
  1、安装demo程序
  2、清空后台驻留应用
  3、启动demo程序，点击“startLockTask()”按键
  4、分别在不同系统设备上尝试全面屏手势“从屏幕底部上滑”与“从屏幕底部上滑并按住”两种手势
  5、使用了原生全面屏手势的设备上会禁用上述手势并弹出提示需解除锁定屏幕状态
  6、MIUI设备不会屏蔽上述手势，执行上述操作会导致demo程序仍处于运行状态且不会触发activity的onPause或onUserLeaveHint等函数(logcat可见)，却无法正常进行操作与使用。
  7、目前测试发现轻按电源键锁定屏幕可以触发onPause等函数，并由此中止固定状态
  
 本人需求：
  1、MIUI的全面屏手势实现方式似乎与原生并不一致，请问上述两个“Home键”与“Task键”手势是否有其自身的监听方式？如有，是否方便告知接口？
  2、MIUI全面屏手势似乎并未在“Task栏”中将应用程序置为非活性状态，而是在确定点击到其他某应用(或是点击空白进入launcher)后才使之前应用失去活性。
