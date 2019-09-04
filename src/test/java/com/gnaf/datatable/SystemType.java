package com.gnaf.datatable;

import org.junit.Test;

import javax.swing.text.Highlighter;
import java.security.Principal;
import java.security.PrivateKey;
import java.util.HashMap;
import java.util.Map;

public class SystemType {
    public static int low;
    public static int high;

    @Test
    public  void achieve() {

        Map sysmap=new HashMap();
        sysmap.put(0,"通用");
        sysmap.put(1,"火灾报警系统");
//        (2,9)
        sysmap.put(this.checknum(2,9),"预留");
        sysmap.put(10,"消防联动控制器");
        sysmap.put(11,"消防栓系统");
        sysmap.put(12,"自动喷水灭火系统");
        sysmap.put(13,"气体灭火系统");
        sysmap.put(14,"水喷雾灭火系统(泵启动方式)");
        sysmap.put(15,"水喷雾灭火系统(压力容器启动方式)");
        sysmap.put(16,"泡沫灭火系统");
        sysmap.put(17,"干粉灭火系统");
        sysmap.put(18,"防烟排烟系统");
        sysmap.put(19,"防火门及卷帘系统");
        sysmap.put(20,"消防电梯");
        sysmap.put(21,"消防应急广播");
        sysmap.put(22,"消防应急照明和疏散指示系统");
        sysmap.put(23,"消防电源");
        sysmap.put(24,"消防电话");
//        (25,27)
        sysmap.put(this.checknum(25,27),"预留");
//        (128,255)
        sysmap.put(this.checknum(128,255),"用户自定义");
        sysmap.put(128,"电器火灾监控系统");
        sysmap.put(129,"终端设备");
        sysmap.put(130,"预留");
        sysmap.put(131,"无线报警传输装置");
        sysmap.put(132,"家用火灾报警系统");
        sysmap.put(133,"物联网数据采集终端");
        sysmap.put(135,"组合式探测器");
        sysmap.put(136,"NB探测器系统");

        System.out.println(sysmap.get(maphave(5)));

    }

    public  int checknum(int lownum,int highnum){

        return (lownum+highnum)/2;
    }
    public int maphave(int keynum){
        int low1=2;
        int high1=9;
        int low2=25;
        int high2=27;
        int low3=128;
        int high3=255;
        if (keynum>=low1&&keynum<=high1){
            return (low1+high1)/2;
        }else if (keynum>=low2&&keynum<=high2){
            return (low2+high2)/2;
        }else if (keynum>=low3&&keynum<=high3){
            return (low3+high3)/2;
        }else {
            return keynum;
        }

    }

}
