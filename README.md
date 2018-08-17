## 学习Android的练习

* https://www.bilibili.com/video/av18008899/ 现在在看B站视频

- 2.1.1 按视频改LinearLayout，效果没刷新，百度后Failed to load AppCompat ActionBar with unknown error.
修改styles.xml文件parent属性前面加上Base后，效果刷新

- 2.2 从API level 24开始，fromHtml(String)被废弃，使用fromHtml(String source, int flags) 代替
flags:

    FROM_HTML_MODE_COMPACT：html块元素之间使用一个换行符分隔
    FROM_HTML_MODE_LEGACY：html块元素之间使用两个换行符分隔


* 安卓6.0默认阻止http请求在AndroidMainfest.xml里添加android:usesCleartextTraffic="true"的属性就可以了