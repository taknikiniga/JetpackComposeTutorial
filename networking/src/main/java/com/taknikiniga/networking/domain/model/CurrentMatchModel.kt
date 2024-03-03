package com.taknikiniga.networking.domain.model


import com.google.gson.annotations.SerializedName

data class CurrentMatchModel(
    @SerializedName("CurrentCompetitionDetails")
    val currentCompetitionDetails: List<CurrentCompetitionDetail>,
    @SerializedName("ResponseError")
    val responseError: Boolean
) {
    data class CurrentCompetitionDetail(
        @SerializedName("BannerUrl")
        val bannerUrl: String,
        @SerializedName("CompetitionId")
        val competitionId: Int,
        @SerializedName("EndDateTime")
        val endDateTime: String,
        @SerializedName("Formats")
        val formats: List<Format>,
        @SerializedName("HasStanding")
        val hasStanding: String,
        @SerializedName("IsTour")
        val isTour: Boolean,
        @SerializedName("LogoUrl")
        val logoUrl: String,
        @SerializedName("Name")
        val name: String,
        @SerializedName("Order")
        val order: Int,
        @SerializedName("SeriesUrl")
        val seriesUrl: String,
        @SerializedName("StartDateTime")
        val startDateTime: String,
        @SerializedName("TourCompetitions")
        val tourCompetitions: List<TourCompetition>,
        @SerializedName("TourId")
        val tourId: Int
    ) {
        data class Format(
            @SerializedName("AssociatedMatchType")
            val associatedMatchType: String,
            @SerializedName("DisplayName")
            val displayName: String,
            @SerializedName("SeriesFormatName")
            val seriesFormatName: String
        )

        data class TourCompetition(
            @SerializedName("AssociatedMatchType")
            val associatedMatchType: String,
            @SerializedName("BannerImageUrl")
            val bannerImageUrl: String,
            @SerializedName("DrinksNotificationEnabled")
            val drinksNotificationEnabled: Boolean,
            @SerializedName("EndDateTime")
            val endDateTime: String,
            @SerializedName("HasStanding")
            val hasStanding: String,
            @SerializedName("Id")
            val id: Int,
            @SerializedName("ImageUrl")
            val imageUrl: String,
            @SerializedName("IsPublished")
            val isPublished: Boolean,
            @SerializedName("IsWomensCompetition")
            val isWomensCompetition: Boolean,
            @SerializedName("Name")
            val name: String,
            @SerializedName("OptaId")
            val optaId: Int,
            @SerializedName("Order")
            val order: Int,
            @SerializedName("RelatedSeriesIds")
            val relatedSeriesIds: String,
            @SerializedName("SeriesGradient")
            val seriesGradient: String,
            @SerializedName("SitecoreId")
            val sitecoreId: String,
            @SerializedName("StartDateTime")
            val startDateTime: String,
            @SerializedName("StatisticsProvider")
            val statisticsProvider: String,
            @SerializedName("ThemeUrl")
            val themeUrl: String,
            @SerializedName("TwitterHandle")
            val twitterHandle: String,
            @SerializedName("Url")
            val url: String,
            @SerializedName("ViewerVerdict")
            val viewerVerdict: Boolean
        )
    }
}