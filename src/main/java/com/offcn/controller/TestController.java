package com.offcn.controller;

/**
 * 作者：赵灿
 * 日期：2020-11-27
 */
// 分享本地项目到GitHub上：  VCS -> Import into Version Control -> Share Project on GitHub
public class TestController {
    public void hello(){
        // 提交代码到本地仓库：在修改的位置 右键 -> Git -> Commit Directory... -> commit（仅提交到本地仓库） / commit and push（提交到本地仓库并且同时提交到中央仓库（GitHub））
        // 提交本地修改后的代码到GitHub：右键 -> Git -> Repository -> push... (将本地仓库中代码的修改，提交到中央仓库（GitHub）)
        System.out.println("本地修改，提交到Github上");
        // 下载GitHub中修改后的代码：右键 -> Git -> Repository -> pull...
        System.out.println("组员A修改了代码并提交到GitHub上");

        System.out.println("新员工B在分支上所做的修改");

        System.out.println("新员工C修改了代码，并提交到GitHub了");
    }
}
