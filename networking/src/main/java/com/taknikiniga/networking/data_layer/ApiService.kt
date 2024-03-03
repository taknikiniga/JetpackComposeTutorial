package com.taknikiniga.networking.data_layer

import com.taknikiniga.networking.domain.model.CurrentMatchModel
import com.taknikiniga.networking.domain.model.MatchFixModel
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface ApiService {

    @GET("competitions/current")
    @Headers("Accept: application/json", "Content-Type: application/json")
    suspend fun getCurrentCompetitions(): Response<CurrentMatchModel>


    @GET("mobile/views/fixtures")
    @Headers("Accept: application/json", "Content-Type: application/json")
    suspend fun getFixturesList(
        @Query("UpcomingFixturesCount") upcomingCount: String ="30",
        @Query("InProgressFixturesCount") inProgressCount: String ="30",
        @Query("CompletedFixturesCount") completedFix: String="30"
    ): Response<MatchFixModel>
//
//    @GET("mobile/views/fixtures")
//    @Headers("Accept: application/json", "Content-Type: application/json")
//    fun getFixturesList(
//        @Query("CompetitionId") str: String?,
//        @Query("UpcomingFixturesCount") str2: String?,
//        @Query("InProgressFixturesCount") str3: String?,
//        @Query("CompletedFixturesCount") str4: String?
//    ): Call<MatchFix?>?
//
//    @GET("mobile/views/comments")
//    @Headers("Accept: application/json", "Content-Type: application/json")
//    fun getMatchComments(
//        @Query("FixtureId") str: String?,
//        @Query("InningNumber") str2: String?
//    ): Call<CommentsMain?>?
//
//    @GET("mobile/views/comments")
//    @Headers("Accept: application/json", "Content-Type: application/json")
//    fun getMatchCommentsByOver(
//        @Query("FixtureId") str: String?,
//        @Query("InningNumber") str2: String?,
//        @Query("LastOverNumber") str3: String?
//    ): Call<CommentsMain?>?
//
//    @GET("mobile/views/scorecard")
//    @Headers("Accept: application/json", "Content-Type: application/json")
//    fun getMatchScorecard(@Query("FixtureId") str: String?): Call<Scorecard?>?
//
//    @GET("mobile/views/summary")
//    @Headers("Accept: application/json", "Content-Type: application/json")
//    fun getMatchSummary(@Query("FixtureId") str: String?): Call<Summary?>?
//
//    @GET("mobile/views/standings")
//    @Headers("Accept: application/json", "Content-Type: application/json")
//    fun getStandings(@Query("CompetitionId") str: String?): Call<StandingsMain?>?

}