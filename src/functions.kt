fun main() {
    name()
    fact()
    var result= modulus(22,7)
    print(result)
    var deed=add(4,5,8,9)
    print(deed)

}
fun name(){
    var name="hello Edna"
    print(name)
}
fun modulus(num1:Int,num2:Int):Int {
    var modulus = num1%num2
    return modulus
}
fun add(num1:Int,num2:Int,num3:Int,num4:Int):Int{
    var add=num1+num2+num3+num4
    return add
}
fun fact(){
    var fact="I love mystries"
}