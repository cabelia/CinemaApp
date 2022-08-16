package com.example.moviecatalogue.ui.home

import androidx.recyclerview.widget.RecyclerView
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.IdlingRegistry
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.swipeLeft
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.example.moviecatalogue.R
import com.example.moviecatalogue.utils.DataDummyFilm
import com.example.moviecatalogue.utils.EspressoIdlingResources
import org.hamcrest.core.AllOf.allOf
import org.junit.After
import org.junit.Before
import org.junit.Test

class HomeActivityTest {
    private val dummyMovie = DataDummyFilm.generateDummyMovie()
    private val dummySeries = DataDummyFilm.generateDummySeries()

    @Before
    fun setUp() {
        ActivityScenario.launch(HomeActivity::class.java)
        IdlingRegistry.getInstance().register(EspressoIdlingResources.idlingResource)
    }

    @After
    fun tearDown() {
        IdlingRegistry.getInstance().unregister(EspressoIdlingResources.idlingResource)
    }

    @Test
    fun loadMovie() {
        onView(allOf(withId(R.id.rv_movies), isDisplayed()))
        onView(
            allOf(
                withId(R.id.rv_movies),
                isDisplayed()
            )
        ).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyMovie.size))
    }

    @Test
    fun loadDetailMovie() {
        onView(allOf(withId(R.id.rv_movies))).perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                0,
                click()
            )
        )
        onView(withId(R.id.tvTitle)).check(matches(isDisplayed()))
        onView(withId(R.id.tvStars)).check(matches(isDisplayed()))
        onView(withId(R.id.tvOverview)).check(matches(isDisplayed()))
        onView(withId(R.id.tvGenre)).check(matches(isDisplayed()))
        onView(withId(R.id.tvRuntime)).check(matches(isDisplayed()))
        onView(withId(R.id.tvLanguage)).check(matches(isDisplayed()))
        onView(withId(R.id.tvRelease)).check(matches(isDisplayed()))
        onView(withId(R.id.tvDirector)).check(matches(isDisplayed()))
        onView(withId(R.id.tvWriter)).check(matches(isDisplayed()))
        onView(withId(R.id.tvProduction)).check(matches(isDisplayed()))
        onView(withId(R.id.tvRating)).check(matches(isDisplayed()))
        onView(withId(R.id.img1)).check(matches(isDisplayed()))
        onView(withId(R.id.img2)).check(matches(isDisplayed()))
        onView(withId(R.id.img3)).check(matches(isDisplayed()))

    }

    @Test
    fun loadSeries() {
        onView(allOf(withId(R.id.rv_movies), isDisplayed())).perform(swipeLeft())
        onView(allOf(withId(R.id.rv_series), isDisplayed()))
        onView(
            allOf(
                withId(R.id.rv_series),
                isDisplayed()
            )
        ).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummySeries.size))
    }

    @Test
    fun loadDetailSeries() {
        onView(allOf(withId(R.id.rv_movies), isDisplayed())).perform(swipeLeft())
        onView(allOf(withId(R.id.rv_series))).perform(
            (RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                0,
                click()
            ))
        )
        onView(withId(R.id.tvTitle)).check(matches(isDisplayed()))
        onView(withId(R.id.tvOverview)).check(matches(isDisplayed()))
        onView(withId(R.id.tvStars)).check(matches(isDisplayed()))
        onView(withId(R.id.tvGenre)).check(matches(isDisplayed()))
        onView(withId(R.id.tvEpisodes)).check(matches(isDisplayed()))
        onView(withId(R.id.tvLanguage)).check(matches(isDisplayed()))
        onView(withId(R.id.tvRelease)).check(matches(isDisplayed()))
        onView(withId(R.id.tvProducer)).check(matches(isDisplayed()))
        onView(withId(R.id.tvProduction)).check(matches(isDisplayed()))
        onView(withId(R.id.img1)).check(matches(isDisplayed()))
        onView(withId(R.id.img2)).check(matches(isDisplayed()))
        onView(withId(R.id.img3)).check(matches(isDisplayed()))

    }

}
