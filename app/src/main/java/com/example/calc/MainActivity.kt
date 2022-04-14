package com.example.calc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.util.Log
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {

    fun String.toEditable(): Editable = Editable.Factory.getInstance().newEditable(this)

    //var disp:String=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mc = mutableListOf<String>()

        var disp: String = ""
        var TheAnswer: String = ""
        var calcing: String = ""
        val PreviousCalculation = findViewById<TextView>(R.id.previousCalculationView)
        val displaY = findViewById<EditText>(R.id.displayEditor)

        val ZeroBut = findViewById<Button>(R.id.button19)
        val OneBut = findViewById<Button>(R.id.button15)
        val TwoBut = findViewById<Button>(R.id.button16)
        val ThreeBut = findViewById<Button>(R.id.button17)
        val FourBut = findViewById<Button>(R.id.button20)
        val FiveBut = findViewById<Button>(R.id.button12)
        val SixBut = findViewById<Button>(R.id.button13)
        val SevenBut = findViewById<Button>(R.id.button11)
        val EightBut = findViewById<Button>(R.id.button7)
        val NineBut = findViewById<Button>(R.id.button10)
        val Plus_But = findViewById<Button>(R.id.button18)
        val Minus_But = findViewById<Button>(R.id.button14)
        val Devide_But = findViewById<Button>(R.id.button8)
        val Multip_But = findViewById<Button>(R.id.button9)

        val OpenBracketBut = findViewById<Button>(R.id.button6)
        val CloseBracetBut = findViewById<Button>(R.id.button3)
        val DeleteOne_But = findViewById<ImageButton>(R.id.button4)
        val DeleteAll_But = findViewById<Button>(R.id.button5)
        val Dot_But = findViewById<Button>(R.id.button2)
        val Equals_But = findViewById<Button>(R.id.button)

        val MC_But = findViewById<Button>(R.id.button21)
        val MRPLUS_But = findViewById<Button>(R.id.button23)
        val MRMIN_But = findViewById<Button>(R.id.button22)
        val SIN_But = findViewById<Button>(R.id.button24)
        val COS_But = findViewById<Button>(R.id.button25)
        val TAN_But = findViewById<Button>(R.id.button26)
        val CTG_But = findViewById<Button>(R.id.button27)



        SIN_But.setOnClickListener {

            if(LastSymbolIsNotDigit(disp)){
                disp += "sin("
                calcing += "s_(_"
            }
            displaY.text = disp.toEditable()
        }
        SIN_But.setOnLongClickListener{
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("Function","sin")
            startActivity(intent)
            return@setOnLongClickListener true
        }

        COS_But.setOnClickListener {
            if(LastSymbolIsNotDigit(disp)){
                disp += "cos("
                calcing += "c_(_"
            }
            displaY.text = disp.toEditable()
        }
        COS_But.setOnLongClickListener{
            val intentC = Intent(this, MainActivity2::class.java)
            intentC.putExtra("Function","cos")
            startActivity(intentC)
            return@setOnLongClickListener true
        }
        TAN_But.setOnClickListener {
            if(LastSymbolIsNotDigit(disp)){
                disp += "tan("
                calcing += "t_(_"
            }
            displaY.text = disp.toEditable()
        }
        TAN_But.setOnLongClickListener{
            val intentT = Intent(this, MainActivity2::class.java)
            intentT.putExtra("Function","tan")
            startActivity(intentT)
            return@setOnLongClickListener true
        }
        CTG_But.setOnClickListener {
            if(LastSymbolIsNotDigit(disp)){
                disp += "ctg("
                calcing += "g_(_"
            }
            displaY.text = disp.toEditable()
        }
        CTG_But.setOnLongClickListener{
            val intentCt = Intent(this, MainActivity2::class.java)
            intentCt.putExtra("Function","ctg")
            startActivity(intentCt)
            return@setOnLongClickListener true
        }
        MC_But.setOnClickListener {
            //mc.clear()
            if(!TheAnswer.isEmpty()){
                disp += mc.last()
                calcing += mc.last()
                displaY.text = disp.toEditable()
            }

        }
        MRPLUS_But.setOnClickListener {
            if(!TheAnswer.isEmpty()){
                mc.add(TheAnswer)
                Log.d("TheAnswerPLUS", mc[0]);
            }
        }
        MRMIN_But.setOnClickListener {
            if(!TheAnswer.isEmpty()){
                mc.add(TheAnswer)

            }
        }


        ZeroBut.setOnClickListener {
            disp += "0"
            calcing += "0"
            displaY.text = disp.toEditable()
            }
        OneBut.setOnClickListener {
            disp += "1"
            calcing += "1"
            displaY.text = disp.toEditable()
        }
        TwoBut.setOnClickListener {
            disp += "2"
            calcing += "2"
            displaY.text = disp.toEditable()
        }
        ThreeBut.setOnClickListener {
            disp += "3"
            calcing += "3"
            displaY.text = disp.toEditable()
        }
        FourBut.setOnClickListener {
            disp += "4"
            calcing += "4"
            displaY.text = disp.toEditable()
        }
        FiveBut.setOnClickListener {
            disp += "5"
            calcing += "5"
            displaY.text = disp.toEditable()
        }
        SixBut.setOnClickListener {
            disp += "6"
            calcing += "6"
            displaY.text = disp.toEditable()
        }
        SevenBut.setOnClickListener {
            disp += "7"
            calcing += "7"
            displaY.text = disp.toEditable()
        }
        EightBut.setOnClickListener {
            disp += "8"
            calcing += "8"
            displaY.text = disp.toEditable()
        }
        NineBut.setOnClickListener {
            disp += "9"
            calcing += "9"
            displaY.text = disp.toEditable()
        }
        Plus_But.setOnClickListener {
            if(LastSymbolIsASing(disp)){
                disp += "+"
                calcing += "_+_"
            }
            displaY.text = disp.toEditable()
        }
        Minus_But.setOnClickListener {
            if(LastSymbolIsASing(disp)){
                disp += "-"
                calcing += "_-_"
            }else if(disp.isEmpty()){
                disp += "-"
                calcing += "-"
            }else if(disp.endsWith("(")){
                disp += "-"
                calcing += "-"
            }
            displaY.text = disp.toEditable()
        }
        Devide_But.setOnClickListener {
            if(LastSymbolIsASing(disp)){
                disp += "÷"
                calcing += "_÷_"
            }
            displaY.text = disp.toEditable()
        }
        Multip_But.setOnClickListener {
            if(LastSymbolIsASing(disp)){
                disp += "×"
                calcing += "_×_"
            }
            displaY.text = disp.toEditable()
        }
        OpenBracketBut.setOnClickListener {

            if(!LastSymbolIsASing(disp)&&!disp.endsWith(")")){
                calcing += "(_"
            }else calcing += "_×_(_"
            disp += "("
            displaY.text = disp.toEditable()
        }
        CloseBracetBut.setOnClickListener {
            var counter = 0
            var counter_2 = 0
            for (c in disp)
            {
                if (c == ')') {
                    counter_2++
                }
                if (c == '(') {
                    counter++
                }
            }
            if(counter>counter_2&&!disp.endsWith("-")&&!disp.endsWith("+")&&!disp.endsWith("×")&&!disp.endsWith("÷")){
                disp += ")"
                calcing += "_)"
            }
            displaY.text = disp.toEditable()
        }
        DeleteOne_But.setOnClickListener {
            if(disp.endsWith("-")||disp.endsWith("+")||disp.endsWith("×")||disp.endsWith("÷")){
                disp= disp.dropLast(1)
                calcing=calcing.dropLast(3)
            }else if(disp.endsWith("ctg(")||disp.endsWith("tan(")||disp.endsWith("cos(")||disp.endsWith("sin(")){
                //disp += "ctg("
                //calcing += "g_(_"

                disp= disp.dropLast(4)
                calcing=calcing.dropLast(4)
            }else if(disp.endsWith("(")) {
                if(disp.endsWith("+(")||disp.endsWith("-(")||disp.endsWith("×(")||disp.endsWith("÷(")){
                    disp= disp.dropLast(1)
                    calcing=calcing.dropLast(2)
                }else{
                    disp= disp.dropLast(1)
                    calcing=calcing.dropLast(5)
                }
            }else if(disp.endsWith(")")){
                disp= disp.dropLast(1)
                calcing=calcing.dropLast(2)
            }else{
                disp= disp.dropLast(1)
                calcing=calcing.dropLast(1)
            }

            displaY.text = disp.toEditable()
            //displaY.text = calcing.toEditable()
        }
        DeleteAll_But.setOnClickListener {
            disp = ""
            calcing = ""
            displaY.text = disp.toEditable()
        }
        Dot_But.setOnClickListener {
            disp += "."
            calcing += "."
            displaY.text = disp.toEditable()
        }
        Equals_But.setOnClickListener {
            Log.d("TAG", "message");

            var Opcounter = 0
            var Clcounter = 0
            for (c in disp)
            {
                if (c == ')') {
                    Clcounter++
                }
                if (c == '(') {
                    Opcounter++
                }
            }
            while(Opcounter>Clcounter){
                disp += ")"
                calcing += "_)"
                Clcounter++
            }

            var list = calcing.split("_").toMutableList()
            var leght = list.size
            var position: Int = 0
            var Prpos:Int=0
            var priory:Int = 0
            var BRcol:Int = 0
            var inCount:Int = 0
            //list[0]="8"
            Log.d("TAG", leght.toString());
            while(leght>1){
                position=0
                Prpos = 0
                priory = 0
                inCount = 0
                while(inCount<leght){
                    if(list[inCount]=="×"||list[inCount]=="÷"||list[inCount]=="-"||list[inCount]=="+"){
                        if(priory<2) {
                            priory=2
                            Prpos=position
                        }
                    }
                    if(list[inCount]=="("){
                        if(priory<=3) {
                            priory=3
                            Prpos=position
                        }
                    }
                    position++
                    Log.d("string", list[inCount]);
                    Log.d("priory", priory.toString());
                    Log.d("Prpos", Prpos.toString());
                    inCount++
                }

                if(priory==3){
                    var i:Int = Prpos+1
                    var ii:Int = Prpos+1
                    var secPrior:Int = 0
                    var secPos:Int = 0
                    BRcol=0
                    while(list[i]!=")"){
                        BRcol++
                        i++
                    }
                    Log.d("BRcol", BRcol.toString());
                    while(BRcol>0){
                        while(ii<i&&BRcol>1){
                            if(list[ii]=="×"||list[ii]=="÷"){
                                Log.d("Sing", "mul or div");
                                val firtM: Double = list[ii-1].toDouble()
                                val SecondM: Double = list[ii+1].toDouble()
                                Log.d("first", firtM.toString());
                                Log.d("second", SecondM.toString());
                                var rez: Double = 0.0
                                if(list[ii]=="×"){
                                    rez = firtM*SecondM
                                    }else{
                                    rez = firtM/SecondM
                                }
                                list[ii-1]=rez.toString()
                                var iii:Int = ii
                                while(iii<leght-2){
                                    list[iii]=list[iii+2]
                                    iii++
                                }
                                var gh:Int=0
                                while(gh<list.size){
                                    Log.d("list",list[gh]);
                                    gh++
                                }

                                BRcol -= 2
                                ii-=2
                                leght-=2
                                Log.d("BRcol",BRcol.toString());
                                Log.d("ii",ii.toString());
                                Log.d("leght",leght.toString());
                            }
                            ii++
                        }
                        ii=Prpos+1
                        Log.d("first", (Prpos+1).toString());
                        while(ii<i&&BRcol>1){
                            Log.d("Sing", "add or div");

                            if(list[ii]=="-"||list[ii]=="+"){
                                val firtM: Double = list[ii-1].toDouble()
                                val SecondM: Double = list[ii+1].toDouble()
                                Log.d("first", firtM.toString());
                                Log.d("second", SecondM.toString());
                                var rez: Double = 0.0
                                if(list[ii]=="+"){
                                    rez = firtM+SecondM
                                }else{
                                    rez = firtM-SecondM
                                }
                                list[ii-1]=rez.toString()
                                Log.d("second", rez.toString());
                                var iii:Int = ii
                                Log.d("second", iii.toString());
                                Log.d("second", (leght-2).toString());
                                while(iii<leght-2){
                                    Log.d("was", list[iii]);
                                    Log.d("now is", list[iii+2]);
                                    list[iii]=list[iii+2]
                                    iii++
                                }
                                BRcol -= 2
                                ii-=2
                                leght-=2

                                Log.d("BRcol",BRcol.toString());
                                Log.d("ii",ii.toString());
                                Log.d("leght",leght.toString());
                            }
                            ii++
                        }
                        var iiii:Int = Prpos
                        var ui:Double= 0.0
                        if(Prpos>0){
                            if(list[Prpos-1]=="s"||list[Prpos-1]=="c"||list[Prpos-1]=="t"||list[Prpos-1]=="g"){
                                if(list[Prpos-1]=="s"){
                                    ui = Math.sin(list[Prpos+1].toDouble())
                                }else if(list[Prpos-1]=="c"){
                                    ui = Math.cos(list[Prpos+1].toDouble())
                                }else if(list[Prpos-1]=="t"){
                                    ui = Math.tan(list[Prpos+1].toDouble())
                                }else{
                                    ui = Math.atan(list[Prpos+1].toDouble())
                                }

                                list[Prpos-1] = ui.toString()
                                while(iiii<leght-3){
                                    list[iiii]=list[iiii+3]
                                    Log.d("was", list[iiii]);
                                    Log.d("now is", list[iiii+1]);
                                    Log.d("less then", (Prpos+BRcol).toString());//скидывание скобок

                                    iiii++
                                }
                                leght-=3
                                BRcol=0


                            }else{
                                Log.d("start rem", iiii.toString());
                                while(iiii<leght-2){
                                    Log.d("was", list[iiii]);
                                    Log.d("now is", list[iiii+1]);
                                    Log.d("less then", (Prpos+BRcol).toString());//скидывание скобок
                                    if(iiii<Prpos+BRcol){
                                        list[iiii]=list[iiii+1]
                                    }else list[iiii]=list[iiii+2]

                                    iiii++
                                }
                                leght-=2
                                BRcol=0
                            }
                        }else{
                            while(iiii<leght-2){
                                if(iiii<Prpos+BRcol){
                                    list[iiii]=list[iiii+1]
                                }else list[iiii]=list[iiii+2]

                                iiii++
                            }
                            leght-=2
                            BRcol=0
                        }



                        var gh:Int=0
                        while(gh<list.size){
                            Log.d("list",list[gh]);
                            gh++
                        }

                        //Log.d("newLenght", leght.toString());
                        //priory = 0
                    }
                }
                if(priory==2){
                    var posi:Int = 0
                    while(posi<leght){
                        Log.d("Sing", "mul or div");
                        if(list[posi]=="×"||list[posi]=="÷"){
                            val firtM: Double = list[posi-1].toDouble()
                            val SecondM: Double = list[posi+1].toDouble()
                            var rez: Double = 0.0
                            if(list[posi]=="×"){
                                rez = firtM*SecondM
                            }else{
                                rez = firtM/SecondM
                            }
                            list[posi-1]=rez.toString()
                            var iii:Int = posi
                            while(iii<leght-2){
                                list[iii]=list[iii+2]
                                iii++
                            }
                            posi-=2
                            leght-=2
                        }
                        posi++
                    }
                    posi = 0
                    while(posi<leght){
                        if(list[posi]=="-"||list[posi]=="+"){
                            Log.d("Sing", "min or plus");
                            Log.d("finish", list[posi].toString());
                            val firtM: Double = list[posi-1].toDouble()
                            val SecondM: Double = list[posi+1].toDouble()
                            Log.d("first", firtM.toString());
                            Log.d("second", SecondM.toString());
                            var rez: Double = 0.0
                            if(list[posi]=="+"){
                                rez = firtM+SecondM
                            }else{
                                rez = firtM-SecondM
                            }
                            Log.d("ans", rez.toString());
                            list[posi-1]=rez.toString()
                            var iii:Int = posi
                            Log.d("start", iii.toString());
                            Log.d("finish", (leght-3).toString());
                            while(iii<(leght-2)){
                                Log.d("heheheheheheheheheh", list[iii].toString());
                                list[iii]=list[iii+2]
                                Log.d("was", list[iii]);
                                Log.d("now", list[iii+2]);
                                iii++
                            }

                            posi-=2
                            leght-=2
                        }
                        posi++
                    }
                }

                //priory = 0

            }

            TheAnswer= list[0]
            Log.d("TheAnswer", TheAnswer);
            displaY.text = list[0].toEditable()
        }


    }
    /*
    fun zeroBTNpush(view: View){
        disp+="0"
        displaY.text=disp.toEditable()

    }

 */


    fun LastSymbolIsASing(here:String):Boolean{
        return !here.endsWith("-")&&!here.endsWith("+")&&!here.endsWith("×")&&!here.endsWith("÷")&&!here.isEmpty()&&!here.endsWith("(")
    }
    fun LastSymbolIsNotDigit(here:String):Boolean{
        return !here.endsWith("1")&&!here.endsWith("2")&&!here.endsWith("3")&&!here.endsWith("4")&&!here.endsWith("5")&&!here.endsWith("6")&&!here.endsWith("7")&&!here.endsWith("8")&&!here.endsWith("9")&&!here.endsWith("0")&&!here.endsWith(".")&&!here.endsWith(")")
    }
    //fun Counting(here:String):Double

}