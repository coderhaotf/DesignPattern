package com.design.pattern.门面模式;

public class ModenPostOffice {
    private ILetterProcess letterProcess = new LetterProcessImpl();
    private Police letterPolice = new Police();
    //写信，封装，投递，一体化
    public void sendLetter(String context,String address){
        //帮你写信
        letterProcess.writeContext(context);
        //写好信封
        letterProcess.fillEnvelope(address);
        //把信放到信封中
        letterProcess.letterInotoEnvelope();
        //警察要检查信件了
        letterPolice.checkLetter(letterProcess);
        //邮递信件
        letterProcess.sendLetter();
    }
}
