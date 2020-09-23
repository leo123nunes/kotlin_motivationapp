package com.leo123nunes.motivationapp.Mock

import android.content.res.Resources
import com.leo123nunes.motivationapp.R
import com.leo123nunes.motivationapp.Repository.Phrase
import com.leo123nunes.motivationapp.infra.MotivationConstants
import kotlin.random.Random

class PhrasesMock(resources: Resources) {

    private val ALL = MotivationConstants.PHRASEFILTER.ALL
    private val HAPPY = MotivationConstants.PHRASEFILTER.HAPPY
    private val MORNING = MotivationConstants.PHRASEFILTER.MORNING


    private val phrasesList: List<Phrase> = listOf(
        Phrase(resources.getString(R.string.phrase1), HAPPY),
        Phrase(resources.getString(R.string.phrase2), HAPPY),
        Phrase(resources.getString(R.string.phrase3), HAPPY),
        Phrase(resources.getString(R.string.phrase4), HAPPY),
        Phrase(resources.getString(R.string.phrase5), HAPPY),
        Phrase(resources.getString(R.string.phrase6), HAPPY),
        Phrase(resources.getString(R.string.phrase7), MORNING),
        Phrase(resources.getString(R.string.phrase8), MORNING),
        Phrase(resources.getString(R.string.phrase9), MORNING),
        Phrase(resources.getString(R.string.phrase10), MORNING),
        Phrase(resources.getString(R.string.phrase11), MORNING),
        Phrase(resources.getString(R.string.phrase12), MORNING),
        Phrase(resources.getString(R.string.phrase13), MORNING)
    )

    fun pickPhrase(filter: String): Phrase {
        var filteredList = phrasesList.filter { it.filter == filter || filter == ALL }

        var randomIndex = Random.nextInt(filteredList.size)

        return filteredList[randomIndex]
    }
}