package com.example.emotionsense

import android.accessibilityservice.AccessibilityService
import android.view.accessibility.AccessibilityEvent
import android.util.Log

class InputAnalyzer : AccessibilityService() {
    override fun onAccessibilityEvent(event: AccessibilityEvent?) {
        if (event?.eventType == AccessibilityEvent.TYPE_VIEW_TEXT_CHANGED) {
            Log.d("EmotionSense", "检测到文本变化")
            // TODO: 添加具体的输入行为分析逻辑
        }
    }

    override fun onInterrupt() {
        Log.d("EmotionSense", "服务中断")
    }
}
