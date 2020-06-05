package com.example.bottombarandtablayoutexample.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomogenousContentViewModel : ViewModel() {

    private val quotesList: LiveData<List<String>>

    init {
        quotesList = MutableLiveData(
            mutableListOf(
                "“Waste no more time arguing what a good man should be. Be One.” – Marcus Aurelius",
                "“Think of the life you have lived until now as over and, as a dead man, see what’s left as a bonus and live it according to Nature. Love the hand that fate deals you and play it as your own, for what could be more fitting?” – Marcus Aurelius",
                "“It never ceases to amaze me: we all love ourselves more than other people, but care more about their opinion than our own.” – Marcus Aurelius",
                "“In your actions, don’t procrastinate. In your conversations, don’t confuse. In your thoughts, don’t wander. In your soul, don’t be passive or aggressive. In your life, don’t be all about business.” – Marcus Aurelius",
                "“If it is not right, do not do it, if it is not true, do not say it.” – Marcus Aurelius",
                "“The best revenge is not to be like your enemy.” – Marcus Aurelius",
                "“Choose not to be harmed — and you won’t feel harmed. Don’t feel harmed — and you haven’t been.” – Marcus Aurelius",
                "“It’s time you realized that you have something in you more powerful and miraculous than the things that affect you and make you dance like a puppet.” – Marcus Aurelius",
                "“External thinks are not the problem. It’s your assessment of them. Which you can erase right now.” – Marcus Aurelius",
                "“If anyone can refute me—show me I’m making a mistake or looking at things from the wrong perspective—I’ll gladly change. It’s the truth I’m after, and the truth never harmed anyone.” – Marcus Aurelius",
                "“You could leave life right now. Let that determine what you do and say and think.” – Marcus Aurelius",
                "“Be tolerant with others and strict with yourself.” – Marcus Aurelius",
                "“We are more often frightened than hurt; and we suffer more in imagination than in reality.” – Seneca",
                "“If a man knows not which port he sails, no wind is favorable.” – Seneca",
                "“No person has the power to have everything they want, but it is in their power not to want what they don’t have, and to cheerfully put to good use what they do have.” – Seneca",
                "“Nothing, to my way of thinking, is a better proof of a well ordered mind than a man’s ability to stop just where he is and pass some time in his own company.” – Seneca",
                "“He who fears death will never do anything worth of a man who is alive.” – Seneca",
                "“This is our big mistake: to think we look forward to death. Most of death is already gone. Whatever time has passed is owned by death.” – Seneca",
                "“Life is very short and anxious for those who forget the past, neglect the present, and fear the future.” – Seneca"
            )
        )
    }

    fun getQuotesList(): LiveData<List<String>> = quotesList

}