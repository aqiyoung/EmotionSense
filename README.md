# EmotionSense 🧠

**小米澎湃 OS 3 专属情绪感知应用**

EmotionSense 是一款运行在 Android 后台的智能情绪感知应用。它通过无障碍服务实时分析你的输入行为和应用使用习惯，智能判断你当前的情绪状态，并联动 OpenClaw (Jarvis) 助手提供更贴心的交互体验。

---

## 🚀 核心功能

*   **输入法行为分析**：监测打字速度、删除频率和标点符号使用，识别焦虑或急促情绪。
*   **应用使用监控**：统计高频应用切换和屏幕使用时间，判断专注度或疲惫感。
*   **情绪状态判断**：内置情绪引擎，实时输出情绪分数（焦虑、兴奋、疲惫等）。
*   **AI 助手联动**：将情绪状态同步给 OpenClaw，让 Jarvis 自动切换沟通风格（如：开启“灭火模式”或“同频模式”）。

---

## 📱 安装与设置 (小米 15 / 澎湃 OS 3)

### 1. 下载安装
从 GitHub [Actions](https://github.com/aqiyoung/EmotionSense/actions) 或 [Releases](https://github.com/aqiyoung/EmotionSense/releases) 下载最新的 `EmotionSense-debug.apk` 并安装。

### 2. 权限配置 (必做)
为了确保应用在后台稳定运行，请完成以下设置：
*   **无障碍服务**：`设置` > `更多设置` > `无障碍` > `已下载的服务` > 开启 **情绪感知**。
*   **应用使用统计**：`设置` > `隐私保护` > `特殊权限设置` > **有权查看使用情况的应用** > 允许 EmotionSense。
*   **省电策略**：`设置` > `应用设置` > `应用管理` > EmotionSense > `省电策略` > 选择 **无限制**。
*   **自启动**：在应用管理中找到 EmotionSense，开启 **自启动** 权限。

---

## 🛠️ 技术栈

*   **语言**: Kotlin
*   **构建工具**: Gradle 8.0 / AGP 8.1.0
*   **核心技术**: Android AccessibilityService, UsageStatsManager
*   **自动化**: GitHub Actions (自动构建 APK)

---

## 🤖 与 OpenClaw 联动

EmotionSense 是 OpenClaw “情绪感知”体系的重要一环。当手机端检测到情绪波动时，可以通过本地网络或云端同步将状态发送给运行在 NAS 上的 Jarvis 助手。

**示例场景：**
*   **检测到焦虑** $\rightarrow$ Jarvis 自动进入“简洁模式”，减少废话，直接给结果。
*   **检测到兴奋** $\rightarrow$ Jarvis 启用“同频模式”，使用更多 Emoji 和 enthusiastic 的语气。

---

## 📂 项目结构

```text
EmotionSense/
├── .github/workflows/  # 自动化构建脚本
├── app/
│   ├── src/main/java/  # Kotlin 核心逻辑
│   ├── src/main/res/   # 界面与配置资源
│   └── AndroidManifest.xml
├── build.gradle
└── settings.gradle
```

---

## ⚠️ 注意事项

*   **隐私安全**：所有分析逻辑均在**本地设备**运行，不会上传任何输入内容或个人隐私数据。
*   **电池消耗**：由于涉及后台实时监控，建议在不使用时手动关闭无障碍服务以节省电量。

---

**Powered by Jarvis & Young** 🤖🦞
