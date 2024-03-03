package com.taknikiniga.networking.domain.model


import com.google.gson.annotations.SerializedName

data class MatchFixModel(
    @SerializedName("CompletedFixtures")
    val completedFixtures: List<CompletedFixture>,
    @SerializedName("InProgressFixtures")
    val inProgressFixtures: List<InProgressFixture>,
    @SerializedName("ResponseError")
    val responseError: Boolean,
    @SerializedName("UpcomingFixtures")
    val upcomingFixtures: List<UpcomingFixture>
) {
    data class CompletedFixture(
        @SerializedName("AwayTeam")
        val awayTeam: AwayTeam,
        @SerializedName("AwayTeamId")
        val awayTeamId: Int,
        @SerializedName("Competition")
        val competition: Competition,
        @SerializedName("CompetitionId")
        val competitionId: Int,
        @SerializedName("EndDateTime")
        val endDateTime: String,
        @SerializedName("FanHashTag")
        val fanHashTag: String,
        @SerializedName("FanSocialEventId")
        val fanSocialEventId: String,
        @SerializedName("Featured")
        val featured: Boolean,
        @SerializedName("GameStatus")
        val gameStatus: String,
        @SerializedName("GameStatusId")
        val gameStatusId: String,
        @SerializedName("GameType")
        val gameType: String,
        @SerializedName("GameTypeId")
        val gameTypeId: Int,
        @SerializedName("GamedayStatus")
        val gamedayStatus: String,
        @SerializedName("HomeTeam")
        val homeTeam: HomeTeam,
        @SerializedName("HomeTeamId")
        val homeTeamId: Int,
        @SerializedName("Id")
        val id: Int,
        @SerializedName("Innings")
        val innings: List<Inning>,
        @SerializedName("IsCompleted")
        val isCompleted: Boolean,
        @SerializedName("IsDuckworthLewis")
        val isDuckworthLewis: Boolean,
        @SerializedName("IsEnableGameday")
        val isEnableGameday: Boolean,
        @SerializedName("IsInProgress")
        val isInProgress: Boolean,
        @SerializedName("IsLive")
        val isLive: Boolean,
        @SerializedName("IsPublished")
        val isPublished: Boolean,
        @SerializedName("IsVideoReplays")
        val isVideoReplays: Boolean,
        @SerializedName("IsWomensMatch")
        val isWomensMatch: Boolean,
        @SerializedName("LegacyCompetitionId")
        val legacyCompetitionId: Int,
        @SerializedName("LegacyFixtureId")
        val legacyFixtureId: Int,
        @SerializedName("MatchDay")
        val matchDay: Int,
        @SerializedName("MatchDayHomePageImageUrl")
        val matchDayHomePageImageUrl: String,
        @SerializedName("MoreInfoUrl")
        val moreInfoUrl: String,
        @SerializedName("Name")
        val name: String,
        @SerializedName("NumberOfDays")
        val numberOfDays: Int,
        @SerializedName("Order")
        val order: Int,
        @SerializedName("OverrideVenueName")
        val overrideVenueName: String,
        @SerializedName("OversRemaining")
        val oversRemaining: String,
        @SerializedName("ResultText")
        val resultText: String,
        @SerializedName("ResultType")
        val resultType: String,
        @SerializedName("ResultTypeId")
        val resultTypeId: String,
        @SerializedName("SitecoreId")
        val sitecoreId: String,
        @SerializedName("SocialEventId")
        val socialEventId: String,
        @SerializedName("StartDateTime")
        val startDateTime: String,
        @SerializedName("TicketUrl")
        val ticketUrl: String,
        @SerializedName("TossDecision")
        val tossDecision: String,
        @SerializedName("TossResult")
        val tossResult: String,
        @SerializedName("TotalOvers")
        val totalOvers: String,
        @SerializedName("TuneIn")
        val tuneIn: Boolean,
        @SerializedName("TwitterHandle")
        val twitterHandle: String,
        @SerializedName("Venue")
        val venue: Venue,
        @SerializedName("VenueId")
        val venueId: Int,
        @SerializedName("WinType")
        val winType: String,
        @SerializedName("WinTypeId")
        val winTypeId: String,
        @SerializedName("WinningMargin")
        val winningMargin: Int
    ) {
        data class AwayTeam(
            @SerializedName("BackgroundImageUrl")
            val backgroundImageUrl: String,
            @SerializedName("BattingBonus")
            val battingBonus: Double,
            @SerializedName("BowlingBonus")
            val bowlingBonus: Int,
            @SerializedName("FixtureId")
            val fixtureId: Int,
            @SerializedName("Id")
            val id: Int,
            @SerializedName("IsActive")
            val isActive: Boolean,
            @SerializedName("IsHomeTeam")
            val isHomeTeam: Boolean,
            @SerializedName("IsMatchWinner")
            val isMatchWinner: Boolean,
            @SerializedName("IsTossWinner")
            val isTossWinner: Boolean,
            @SerializedName("IsWomensTeam")
            val isWomensTeam: Boolean,
            @SerializedName("LogoUrl")
            val logoUrl: String,
            @SerializedName("Name")
            val name: String,
            @SerializedName("ShortName")
            val shortName: String,
            @SerializedName("TeamColor")
            val teamColor: String,
            @SerializedName("TeambadgeImageUrl")
            val teambadgeImageUrl: String
        )

        data class Competition(
            @SerializedName("BannerImageUrl")
            val bannerImageUrl: String,
            @SerializedName("DrinksNotificationEnabled")
            val drinksNotificationEnabled: Boolean,
            @SerializedName("EndDateTime")
            val endDateTime: String,
            @SerializedName("Formats")
            val formats: List<Format>,
            @SerializedName("Id")
            val id: Int,
            @SerializedName("ImageUrl")
            val imageUrl: String,
            @SerializedName("IsPublished")
            val isPublished: Boolean,
            @SerializedName("IsWomensCompetition")
            val isWomensCompetition: Boolean,
            @SerializedName("LegacyCompetitionId")
            val legacyCompetitionId: Int,
            @SerializedName("Name")
            val name: String,
            @SerializedName("Order")
            val order: Int,
            @SerializedName("Priority")
            val priority: String,
            @SerializedName("RelatedSeriesIds")
            val relatedSeriesIds: String,
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
        ) {
            data class Format(
                @SerializedName("AssociatedMatchType")
                val associatedMatchType: String,
                @SerializedName("DisplayName")
                val displayName: String,
                @SerializedName("SeriesFormatName")
                val seriesFormatName: String
            )
        }

        data class HomeTeam(
            @SerializedName("BackgroundImageUrl")
            val backgroundImageUrl: String,
            @SerializedName("BattingBonus")
            val battingBonus: Double,
            @SerializedName("BowlingBonus")
            val bowlingBonus: Double,
            @SerializedName("FixtureId")
            val fixtureId: Int,
            @SerializedName("Id")
            val id: Int,
            @SerializedName("IsActive")
            val isActive: Boolean,
            @SerializedName("IsHomeTeam")
            val isHomeTeam: Boolean,
            @SerializedName("IsMatchWinner")
            val isMatchWinner: Boolean,
            @SerializedName("IsTossWinner")
            val isTossWinner: Boolean,
            @SerializedName("IsWomensTeam")
            val isWomensTeam: Boolean,
            @SerializedName("LogoUrl")
            val logoUrl: String,
            @SerializedName("Name")
            val name: String,
            @SerializedName("ShortName")
            val shortName: String,
            @SerializedName("TeamColor")
            val teamColor: String,
            @SerializedName("TeambadgeImageUrl")
            val teambadgeImageUrl: String
        )

        data class Inning(
            @SerializedName("BattingTeamId")
            val battingTeamId: Int,
            @SerializedName("BowlingTeamId")
            val bowlingTeamId: Int,
            @SerializedName("ByesRuns")
            val byesRuns: Int,
            @SerializedName("CurrentRunRate")
            val currentRunRate: Double,
            @SerializedName("Day")
            val day: Int,
            @SerializedName("DuckworthLewisOvers")
            val duckworthLewisOvers: String,
            @SerializedName("DuckworthLewisTarget")
            val duckworthLewisTarget: Int,
            @SerializedName("FixtureId")
            val fixtureId: Int,
            @SerializedName("Id")
            val id: Int,
            @SerializedName("InningNumber")
            val inningNumber: Int,
            @SerializedName("IsDeclared")
            val isDeclared: Boolean,
            @SerializedName("IsFollowOn")
            val isFollowOn: Boolean,
            @SerializedName("IsForfeited")
            val isForfeited: Boolean,
            @SerializedName("LegByesRuns")
            val legByesRuns: Int,
            @SerializedName("NoBalls")
            val noBalls: Int,
            @SerializedName("NumberOfWicketsFallen")
            val numberOfWicketsFallen: Int,
            @SerializedName("OvernightRuns")
            val overnightRuns: Int,
            @SerializedName("OvernightWickets")
            val overnightWickets: Int,
            @SerializedName("OversBowled")
            val oversBowled: String,
            @SerializedName("Penalties")
            val penalties: Int,
            @SerializedName("RequiredRunRate")
            val requiredRunRate: Double,
            @SerializedName("RunsScored")
            val runsScored: Int,
            @SerializedName("TotalExtras")
            val totalExtras: Int,
            @SerializedName("WideBalls")
            val wideBalls: Int
        )

        data class Venue(
            @SerializedName("City")
            val city: String,
            @SerializedName("Id")
            val id: Int,
            @SerializedName("ImageUrl")
            val imageUrl: String,
            @SerializedName("Latitude")
            val latitude: String,
            @SerializedName("Longitude")
            val longitude: String,
            @SerializedName("Name")
            val name: String,
            @SerializedName("PhoneNumber")
            val phoneNumber: String
        )
    }

    data class InProgressFixture(
        @SerializedName("AwayTeam")
        val awayTeam: AwayTeam,
        @SerializedName("AwayTeamId")
        val awayTeamId: Int,
        @SerializedName("Competition")
        val competition: Competition,
        @SerializedName("CompetitionId")
        val competitionId: Int,
        @SerializedName("EndDateTime")
        val endDateTime: String,
        @SerializedName("FanHashTag")
        val fanHashTag: String,
        @SerializedName("FanSocialEventId")
        val fanSocialEventId: String,
        @SerializedName("Featured")
        val featured: Boolean,
        @SerializedName("GameStatus")
        val gameStatus: String,
        @SerializedName("GameStatusId")
        val gameStatusId: String,
        @SerializedName("GameType")
        val gameType: String,
        @SerializedName("GameTypeId")
        val gameTypeId: Int,
        @SerializedName("GamedayStatus")
        val gamedayStatus: String,
        @SerializedName("HomeTeam")
        val homeTeam: HomeTeam,
        @SerializedName("HomeTeamId")
        val homeTeamId: Int,
        @SerializedName("Id")
        val id: Int,
        @SerializedName("Innings")
        val innings: List<Inning>,
        @SerializedName("IsCompleted")
        val isCompleted: Boolean,
        @SerializedName("IsDuckworthLewis")
        val isDuckworthLewis: Boolean,
        @SerializedName("IsEnableGameday")
        val isEnableGameday: Boolean,
        @SerializedName("IsInProgress")
        val isInProgress: Boolean,
        @SerializedName("IsLive")
        val isLive: Boolean,
        @SerializedName("IsPublished")
        val isPublished: Boolean,
        @SerializedName("IsVideoReplays")
        val isVideoReplays: Boolean,
        @SerializedName("IsWomensMatch")
        val isWomensMatch: Boolean,
        @SerializedName("LegacyCompetitionId")
        val legacyCompetitionId: Int,
        @SerializedName("LegacyFixtureId")
        val legacyFixtureId: Int,
        @SerializedName("MatchDay")
        val matchDay: Int,
        @SerializedName("MatchDayHomePageImageUrl")
        val matchDayHomePageImageUrl: String,
        @SerializedName("MoreInfoUrl")
        val moreInfoUrl: String,
        @SerializedName("Name")
        val name: String,
        @SerializedName("NumberOfDays")
        val numberOfDays: Int,
        @SerializedName("Order")
        val order: Int,
        @SerializedName("OverrideVenueName")
        val overrideVenueName: String,
        @SerializedName("OversRemaining")
        val oversRemaining: String,
        @SerializedName("ResultText")
        val resultText: String,
        @SerializedName("ResultType")
        val resultType: String,
        @SerializedName("ResultTypeId")
        val resultTypeId: String,
        @SerializedName("SitecoreId")
        val sitecoreId: String,
        @SerializedName("SocialEventId")
        val socialEventId: String,
        @SerializedName("StartDateTime")
        val startDateTime: String,
        @SerializedName("TicketUrl")
        val ticketUrl: String,
        @SerializedName("TossDecision")
        val tossDecision: String,
        @SerializedName("TossResult")
        val tossResult: String,
        @SerializedName("TotalOvers")
        val totalOvers: String,
        @SerializedName("TuneIn")
        val tuneIn: Boolean,
        @SerializedName("TwitterHandle")
        val twitterHandle: String,
        @SerializedName("Venue")
        val venue: Venue,
        @SerializedName("VenueId")
        val venueId: Int
    ) {
        data class AwayTeam(
            @SerializedName("BackgroundImageUrl")
            val backgroundImageUrl: String,
            @SerializedName("BattingBonus")
            val battingBonus: Double,
            @SerializedName("BowlingBonus")
            val bowlingBonus: Double,
            @SerializedName("FixtureId")
            val fixtureId: Int,
            @SerializedName("Id")
            val id: Int,
            @SerializedName("IsActive")
            val isActive: Boolean,
            @SerializedName("IsHomeTeam")
            val isHomeTeam: Boolean,
            @SerializedName("IsMatchWinner")
            val isMatchWinner: Boolean,
            @SerializedName("IsTossWinner")
            val isTossWinner: Boolean,
            @SerializedName("IsWomensTeam")
            val isWomensTeam: Boolean,
            @SerializedName("LogoUrl")
            val logoUrl: String,
            @SerializedName("Name")
            val name: String,
            @SerializedName("ShortName")
            val shortName: String,
            @SerializedName("TeamColor")
            val teamColor: String,
            @SerializedName("TeambadgeImageUrl")
            val teambadgeImageUrl: String
        )

        data class Competition(
            @SerializedName("BannerImageUrl")
            val bannerImageUrl: String,
            @SerializedName("DrinksNotificationEnabled")
            val drinksNotificationEnabled: Boolean,
            @SerializedName("EndDateTime")
            val endDateTime: String,
            @SerializedName("Formats")
            val formats: List<Format>,
            @SerializedName("Id")
            val id: Int,
            @SerializedName("ImageUrl")
            val imageUrl: String,
            @SerializedName("IsPublished")
            val isPublished: Boolean,
            @SerializedName("IsWomensCompetition")
            val isWomensCompetition: Boolean,
            @SerializedName("LegacyCompetitionId")
            val legacyCompetitionId: Int,
            @SerializedName("Name")
            val name: String,
            @SerializedName("Order")
            val order: Int,
            @SerializedName("Priority")
            val priority: String,
            @SerializedName("RelatedSeriesIds")
            val relatedSeriesIds: String,
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
        ) {
            data class Format(
                @SerializedName("AssociatedMatchType")
                val associatedMatchType: String,
                @SerializedName("DisplayName")
                val displayName: String,
                @SerializedName("SeriesFormatName")
                val seriesFormatName: String
            )
        }

        data class HomeTeam(
            @SerializedName("BackgroundImageUrl")
            val backgroundImageUrl: String,
            @SerializedName("BattingBonus")
            val battingBonus: Double,
            @SerializedName("BowlingBonus")
            val bowlingBonus: Int,
            @SerializedName("FixtureId")
            val fixtureId: Int,
            @SerializedName("Id")
            val id: Int,
            @SerializedName("IsActive")
            val isActive: Boolean,
            @SerializedName("IsHomeTeam")
            val isHomeTeam: Boolean,
            @SerializedName("IsMatchWinner")
            val isMatchWinner: Boolean,
            @SerializedName("IsTossWinner")
            val isTossWinner: Boolean,
            @SerializedName("IsWomensTeam")
            val isWomensTeam: Boolean,
            @SerializedName("LogoUrl")
            val logoUrl: String,
            @SerializedName("Name")
            val name: String,
            @SerializedName("ShortName")
            val shortName: String,
            @SerializedName("TeamColor")
            val teamColor: String,
            @SerializedName("TeambadgeImageUrl")
            val teambadgeImageUrl: String
        )

        data class Inning(
            @SerializedName("BattingTeamId")
            val battingTeamId: Int,
            @SerializedName("BowlingTeamId")
            val bowlingTeamId: Int,
            @SerializedName("ByesRuns")
            val byesRuns: Int,
            @SerializedName("CurrentRunRate")
            val currentRunRate: Double,
            @SerializedName("Day")
            val day: Int,
            @SerializedName("DuckworthLewisOvers")
            val duckworthLewisOvers: String,
            @SerializedName("FixtureId")
            val fixtureId: Int,
            @SerializedName("Id")
            val id: Int,
            @SerializedName("InningNumber")
            val inningNumber: Int,
            @SerializedName("IsDeclared")
            val isDeclared: Boolean,
            @SerializedName("IsFollowOn")
            val isFollowOn: Boolean,
            @SerializedName("IsForfeited")
            val isForfeited: Boolean,
            @SerializedName("LegByesRuns")
            val legByesRuns: Int,
            @SerializedName("NoBalls")
            val noBalls: Int,
            @SerializedName("NumberOfWicketsFallen")
            val numberOfWicketsFallen: Int,
            @SerializedName("OvernightRuns")
            val overnightRuns: Int,
            @SerializedName("OvernightWickets")
            val overnightWickets: Int,
            @SerializedName("OversBowled")
            val oversBowled: String,
            @SerializedName("Penalties")
            val penalties: Int,
            @SerializedName("RunsScored")
            val runsScored: Int,
            @SerializedName("TotalExtras")
            val totalExtras: Int,
            @SerializedName("WideBalls")
            val wideBalls: Int
        )

        data class Venue(
            @SerializedName("City")
            val city: String,
            @SerializedName("Id")
            val id: Int,
            @SerializedName("ImageUrl")
            val imageUrl: String,
            @SerializedName("Latitude")
            val latitude: String,
            @SerializedName("Longitude")
            val longitude: String,
            @SerializedName("Name")
            val name: String,
            @SerializedName("PhoneNumber")
            val phoneNumber: String
        )
    }

    data class UpcomingFixture(
        @SerializedName("AwayTeam")
        val awayTeam: AwayTeam,
        @SerializedName("AwayTeamId")
        val awayTeamId: Int,
        @SerializedName("Competition")
        val competition: Competition,
        @SerializedName("CompetitionId")
        val competitionId: Int,
        @SerializedName("EndDateTime")
        val endDateTime: String,
        @SerializedName("FanHashTag")
        val fanHashTag: String,
        @SerializedName("FanSocialEventId")
        val fanSocialEventId: String,
        @SerializedName("Featured")
        val featured: Boolean,
        @SerializedName("GameStatus")
        val gameStatus: String,
        @SerializedName("GameStatusId")
        val gameStatusId: String,
        @SerializedName("GameType")
        val gameType: String,
        @SerializedName("GameTypeId")
        val gameTypeId: Int,
        @SerializedName("GamedayStatus")
        val gamedayStatus: String,
        @SerializedName("HomeTeam")
        val homeTeam: HomeTeam,
        @SerializedName("HomeTeamId")
        val homeTeamId: Int,
        @SerializedName("Id")
        val id: Int,
        @SerializedName("IsCompleted")
        val isCompleted: Boolean,
        @SerializedName("IsDuckworthLewis")
        val isDuckworthLewis: Boolean,
        @SerializedName("IsEnableGameday")
        val isEnableGameday: Boolean,
        @SerializedName("IsInProgress")
        val isInProgress: Boolean,
        @SerializedName("IsLive")
        val isLive: Boolean,
        @SerializedName("IsPublished")
        val isPublished: Boolean,
        @SerializedName("IsVideoReplays")
        val isVideoReplays: Boolean,
        @SerializedName("IsWomensMatch")
        val isWomensMatch: Boolean,
        @SerializedName("LegacyCompetitionId")
        val legacyCompetitionId: Int,
        @SerializedName("LegacyFixtureId")
        val legacyFixtureId: Int,
        @SerializedName("MatchDay")
        val matchDay: Int,
        @SerializedName("MatchDayHomePageImageUrl")
        val matchDayHomePageImageUrl: String,
        @SerializedName("MoreInfoUrl")
        val moreInfoUrl: String,
        @SerializedName("Name")
        val name: String,
        @SerializedName("NumberOfDays")
        val numberOfDays: Int,
        @SerializedName("Order")
        val order: Int,
        @SerializedName("OverrideVenueName")
        val overrideVenueName: String,
        @SerializedName("OversRemaining")
        val oversRemaining: String,
        @SerializedName("ResultText")
        val resultText: String,
        @SerializedName("ResultType")
        val resultType: String,
        @SerializedName("ResultTypeId")
        val resultTypeId: String,
        @SerializedName("SitecoreId")
        val sitecoreId: String,
        @SerializedName("SocialEventId")
        val socialEventId: String,
        @SerializedName("StartDateTime")
        val startDateTime: String,
        @SerializedName("TicketUrl")
        val ticketUrl: String,
        @SerializedName("TossDecision")
        val tossDecision: String,
        @SerializedName("TossResult")
        val tossResult: String,
        @SerializedName("TotalOvers")
        val totalOvers: String,
        @SerializedName("TuneIn")
        val tuneIn: Boolean,
        @SerializedName("TwitterHandle")
        val twitterHandle: String,
        @SerializedName("Venue")
        val venue: Venue,
        @SerializedName("VenueId")
        val venueId: Int
    ) {
        data class AwayTeam(
            @SerializedName("BackgroundImageUrl")
            val backgroundImageUrl: String,
            @SerializedName("BattingBonus")
            val battingBonus: Double,
            @SerializedName("BowlingBonus")
            val bowlingBonus: Double,
            @SerializedName("FixtureId")
            val fixtureId: Int,
            @SerializedName("Id")
            val id: Int,
            @SerializedName("IsActive")
            val isActive: Boolean,
            @SerializedName("IsHomeTeam")
            val isHomeTeam: Boolean,
            @SerializedName("IsMatchWinner")
            val isMatchWinner: Boolean,
            @SerializedName("IsTossWinner")
            val isTossWinner: Boolean,
            @SerializedName("IsWomensTeam")
            val isWomensTeam: Boolean,
            @SerializedName("LegacyTeamId")
            val legacyTeamId: Int,
            @SerializedName("LogoUrl")
            val logoUrl: String,
            @SerializedName("Name")
            val name: String,
            @SerializedName("ShortName")
            val shortName: String,
            @SerializedName("TeamColor")
            val teamColor: String,
            @SerializedName("TeambadgeImageUrl")
            val teambadgeImageUrl: String,
            @SerializedName("UpdateFeedId")
            val updateFeedId: Int,
            @SerializedName("WebsiteUrl")
            val websiteUrl: String
        )

        data class Competition(
            @SerializedName("AssociatedMatchType")
            val associatedMatchType: String,
            @SerializedName("BannerImageUrl")
            val bannerImageUrl: String,
            @SerializedName("DrinksNotificationEnabled")
            val drinksNotificationEnabled: Boolean,
            @SerializedName("EndDateTime")
            val endDateTime: String,
            @SerializedName("Formats")
            val formats: List<Format>,
            @SerializedName("Id")
            val id: Int,
            @SerializedName("ImageUrl")
            val imageUrl: String,
            @SerializedName("IsPublished")
            val isPublished: Boolean,
            @SerializedName("IsWomensCompetition")
            val isWomensCompetition: Boolean,
            @SerializedName("LegacyCompetitionId")
            val legacyCompetitionId: Int,
            @SerializedName("Name")
            val name: String,
            @SerializedName("OptaId")
            val optaId: Int,
            @SerializedName("Order")
            val order: Int,
            @SerializedName("Priority")
            val priority: String,
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
        ) {
            data class Format(
                @SerializedName("AssociatedMatchType")
                val associatedMatchType: String,
                @SerializedName("DisplayName")
                val displayName: String,
                @SerializedName("SeriesFormatName")
                val seriesFormatName: String
            )
        }

        data class HomeTeam(
            @SerializedName("BackgroundImageUrl")
            val backgroundImageUrl: String,
            @SerializedName("BattingBonus")
            val battingBonus: Double,
            @SerializedName("BowlingBonus")
            val bowlingBonus: Double,
            @SerializedName("FixtureId")
            val fixtureId: Int,
            @SerializedName("Id")
            val id: Int,
            @SerializedName("IsActive")
            val isActive: Boolean,
            @SerializedName("IsHomeTeam")
            val isHomeTeam: Boolean,
            @SerializedName("IsMatchWinner")
            val isMatchWinner: Boolean,
            @SerializedName("IsTossWinner")
            val isTossWinner: Boolean,
            @SerializedName("IsWomensTeam")
            val isWomensTeam: Boolean,
            @SerializedName("LegacyTeamId")
            val legacyTeamId: Int,
            @SerializedName("LogoUrl")
            val logoUrl: String,
            @SerializedName("Name")
            val name: String,
            @SerializedName("ShortName")
            val shortName: String,
            @SerializedName("TeamColor")
            val teamColor: String,
            @SerializedName("TeambadgeImageUrl")
            val teambadgeImageUrl: String,
            @SerializedName("UpdateFeedId")
            val updateFeedId: Int,
            @SerializedName("WebsiteUrl")
            val websiteUrl: String
        )

        data class Venue(
            @SerializedName("City")
            val city: String,
            @SerializedName("CountryName")
            val countryName: String,
            @SerializedName("Id")
            val id: Int,
            @SerializedName("ImageUrl")
            val imageUrl: String,
            @SerializedName("Latitude")
            val latitude: String,
            @SerializedName("Longitude")
            val longitude: String,
            @SerializedName("Name")
            val name: String,
            @SerializedName("PhoneNumber")
            val phoneNumber: String,
            @SerializedName("State")
            val state: String,
            @SerializedName("UpdateFeedId")
            val updateFeedId: Int
        )
    }
}