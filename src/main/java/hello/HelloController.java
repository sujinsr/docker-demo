package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        //return "Hello Guys!!! Hope you are doing good today";
        return greeting();
    }
    String greeting() {
        return "<html> \n" +
                "<head>\n" +
                "    <title>Greeting Message using JavaScript</title> \n" +
                "</head>\n" +
                "<body>\n" +
                "    <label id=\"lblGreetings\"></label>\n" +
                "</body>\n" +
                "\n" +
                "<script>\n" +
                "    var myDate = new Date();\n" +
                "    var hrs = myDate.getHours();\n" +
                "\n" +
                "    var greet;\n" +
                "\n" +
                "    if (hrs < 12)\n" +
                "        greet = 'Good Morning';\n" +
                "    else if (hrs >= 12 && hrs <= 17)\n" +
                "        greet = 'Good Afternoon';\n" +
                "    else if (hrs >= 17 && hrs <= 24)\n" +
                "        greet = 'Good Evening';\n" +
                "\n" +
                "    document.getElementById('lblGreetings').innerHTML =\n" +
                "        '<b>' + greet + '</b> and Hello Guys!!! How are you? Testing!!!...';\n" +
                "</script> \n" +
                "</html>\n";
    }

    String greeting2() {
        return "<!-- this script got from www.htmlbestcodes.com-Coded by: Krishna Eydat -->\n" +
                "<html>\n" +
                "<head>\n" +
                "</head>\n" +
                "<body>\n" +
                "\n" +
                "<script language=\"JavaScript\" type=\"Text/JavaScript\">\n" +
                "function fifteenth(){sixteenth();seventeenth();}window.onload=fifteenth;var eighteenth='Hello Guys!!! Hope you all doing good!!!';var nineteenth=10;var twentieth=1000;\n" +
                "function sixteenth(){\n" +
                "if (document.layers)document.first2.top=pageYOffset;\n" +
                "else if (document.all){first2.innerHTML='<div align=center><font face=\"Verdana\">'+eighteenth+'</font></div>';setTimeout('first2.style.top=document.body.scrollTop+50;first2.style.left=document.body.scrollLeft+10',100);}\n" +
                "else if (document.getElementById){document.getElementById('first2').innerHTML='<div align=center><font face=\"Verdana\">'+eighteenth+'</font></div>';document.getElementById('first2').style.top=pageYOffset+50;}}\n" +
                "function seventeenth(){\n" +
                "if (document.layers){document.first2.document.write('<div align=center style=\"font-size:'+nineteenth+'px\"><font face=\"Verdana\">'+eighteenth+'</font></div>');document.first2.document.close();}\n" +
                "else if (document.all)first2.style.fontSize=nineteenth+'px';\n" +
                "else if (document.getElementById)document.getElementById('first2').style.fontSize=nineteenth+'px';nineteenth+=5;\n" +
                "if (nineteenth>90){\n" +
                "if (document.layers)setTimeout(\"document.first2.visibility='hide'\",twentieth);\n" +
                "else if (document.all)setTimeout(\"first2.style.visibility='hidden'\",twentieth);\n" +
                "else if (document.getElementById)setTimeout(\"document.getElementById('first2').style.visibility='hidden'\",twentieth);return;}else setTimeout('seventeenth()',150);}\n" +
                "</script>\n" +
                "<div id='first2' style='position:absolute;color:red'></div>\n" +
                "\n" +
                "<br/><div style=\"clear:both\"></div><div><a target=\"_blank\" href=\"http://www.htmlbestcodes.com/\"><span style=\"font-size: 8pt; text-decoration: none\">HTML Best Codes</span></a></div>\n" +
                "</body>\n" +
                "</html>";
    }
}
