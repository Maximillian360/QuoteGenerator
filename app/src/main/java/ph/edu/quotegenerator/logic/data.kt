package ph.edu.quotegenerator.logic

enum class typeOfQuotes(val list: List<String>){
     loveQuotes(
         listOf(
             "Love is not about how much you say 'I love you,' but how much you can prove that it's true. – Unknown"
             ,"To love and be loved is to feel the sun from both sides. – David Viscott"
             ,"Love is when the other person's happiness is more important than your own. – H. Jackson Brown Jr.")),

    inspireQuotes(
        listOf(
            "The only way to do great work is to love what you do. – Steve Jobs",
            "The only thing standing between you and your goal is the story you keep telling yourself as to why you can't achieve it. – Jordan Belfort",
            "Success is not final, failure is not fatal: It is the courage to continue that counts. – Winston Churchill")),

    funnyQuotes(
        listOf(
            "I'm writing a book. I've got the page numbers done. – Steven Wright",
            "I'm on the seafood diet. I see food and I eat it. – Unknown",
            "If at first, you don't succeed, skydiving is not for you. – Unknown")),
}


