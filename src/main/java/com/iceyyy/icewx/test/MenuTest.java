package com.iceyyy.icewx.test;

import java.util.ArrayList;
import java.util.List;

import com.icexxx.icewx.menu.MenuService;
import com.icexxx.icewx.menu.button.ClickButton;
import com.icexxx.icewx.menu.button.LocationButton;
import com.icexxx.icewx.menu.button.ParentButton;
import com.icexxx.icewx.menu.button.PicButton;
import com.icexxx.icewx.menu.button.ScancodeButton;
import com.icexxx.icewx.menu.button.WxButton;
import com.icexxx.icewx.menu.button.WxMenu;
import com.icexxx.icewx.menu.type.Pic;
import com.icexxx.icewx.menu.type.Scancode;
import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;

public class MenuTest {
    private static final Log log = LogFactory.get();

    public static void main(String[] args) {
        WxMenu menu = new WxMenu();
        List<WxButton> button = new ArrayList<WxButton>();
        WxButton wxButton1 = createWxButton1();
        WxButton wxButton2 = createWxButton2();
        WxButton wxButton3 = createWxButton3();
        button.add(wxButton3);
        button.add(wxButton2);
        button.add(wxButton1);
        menu.setButton(button);
        boolean check = MenuService.create(menu);
        if (check) {
            log.info("菜单创建成功");
        } else {
            log.info("菜单创建失败");
        }
    }

    private static WxButton createWxButton3() {
        ParentButton wxButton = new ParentButton();
        wxButton.setName("涛声依旧");
        List<WxButton> subButton = new ArrayList<WxButton>();
        subButton.add(createWxButton11());
        subButton.add(createWxButton12());
        subButton.add(createWxButton13());
        subButton.add(createWxButton14());
        subButton.add(createWxButton15());
        wxButton.setSub_button(subButton);
        return wxButton;
    }

    private static WxButton createWxButton11() {
        LocationButton wxButton = new LocationButton();
        wxButton.setName("寻找位置");
        // wxButton.setKey(key);
        return wxButton;
    }

    private static WxButton createWxButton12() {
        // MediaButton wxButton=new MediaButton();
        // wxButton.setName("媒体菜单");
        // wxButton.setMedia_id("ID001");
        // return wxButton;
        ClickButton button = new ClickButton();
        // button.setKey(key);
        button.setName("学富五车");
        button.setMessage("海阔天空");
        return button;
    }

    private static WxButton createWxButton13() {
        // MiniprogramButton wxButton=new MiniprogramButton();
        // wxButton.setName("小程序");
        // wxButton.setUrl("http://www.buershu.com");
        // wxButton.setAppid("appid");
        // wxButton.setPagepath("pagepath");
        // return wxButton;
        ClickButton button = new ClickButton();
        // button.setKey(key);
        button.setName("第二菜单");
        button.setMessage("一个消息");
        return button;
    }

    private static WxButton createWxButton14() {
        PicButton wxButton = new PicButton();
        wxButton.setName("图片菜单sy");
        wxButton.setType(Pic.PIC_SYSPHOTO);
        // wxButton.setKey(key);
        // wxButton.setSub_button(sub_button);
        return wxButton;
    }

    private static WxButton createWxButton15() {
        ScancodeButton wxButton = new ScancodeButton();
        wxButton.setName("二维码乙");
        wxButton.setType(Scancode.SCANCODE_WAITMSG);
        // wxButton.setKey(key);
        // wxButton.setSub_button(sub_button);
        return wxButton;
    }

    private static WxButton createWxButton2() {
        ParentButton wxButton = new ParentButton();
        wxButton.setName("主要菜单");
        List<WxButton> subButton = new ArrayList<WxButton>();
        subButton.add(createWxButton21());
        subButton.add(createWxButton22());
        subButton.add(createWxButton23());
        subButton.add(createWxButton24());
        subButton.add(createWxButton25());
        wxButton.setSub_button(subButton);
        return wxButton;
    }
    // private static WxButton createWxButton2() {
    // ClickButton button=new ClickButton();
    //// button.setKey(key);
    // button.setName("第二菜单");
    // button.setMessage("水彩笔芯");
    // return button;
    // }

    private static WxButton createWxButton21() {
        PicButton wxButton = new PicButton();
        wxButton.setName("图片菜单al");
        wxButton.setType(Pic.PIC_PHOTO_OR_ALBUM);
        return wxButton;
    }

    private static WxButton createWxButton22() {
        PicButton wxButton = new PicButton();
        wxButton.setName("图片菜单sy");
        wxButton.setType(Pic.PIC_SYSPHOTO);
        return wxButton;
    }

    private static WxButton createWxButton23() {
        PicButton wxButton = new PicButton();
        wxButton.setName("图片菜单wx");
        wxButton.setType(Pic.PIC_WEIXIN);
        return wxButton;
    }

    private static WxButton createWxButton24() {
        ScancodeButton wxButton = new ScancodeButton();
        wxButton.setName("PUSH");
        wxButton.setType(Scancode.SCANCODE_PUSH);
        return wxButton;
    }

    private static WxButton createWxButton25() {
        ScancodeButton wxButton = new ScancodeButton();
        wxButton.setName("WAITMSG");
        wxButton.setType(Scancode.SCANCODE_WAITMSG);
        return wxButton;
    }

    private static WxButton createWxButton1() {
        // ViewButton button=new ViewButton();
        // button.setName("页面菜单");
        // button.setUrl("http://www.buershu.com/rj.html");
        ScancodeButton wxButton = new ScancodeButton();
        wxButton.setName("二维码丙");
        wxButton.setType(Scancode.SCANCODE_WAITMSG);
        return wxButton;
    }

}
