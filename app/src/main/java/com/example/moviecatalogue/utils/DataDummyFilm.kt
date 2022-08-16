package com.example.moviecatalogue.utils

import com.example.moviecatalogue.data.source.local.entity.MovieEntity
import com.example.moviecatalogue.data.source.local.entity.SeriesEntity
import com.example.moviecatalogue.data.source.local.entity.SeriesWithId
import com.example.moviecatalogue.data.source.remote.response.MovieResponse
import com.example.moviecatalogue.data.source.remote.response.SeriesResponse

object DataDummyFilm {
    fun generateDummyMovie(): List<MovieEntity> {
        val movie = ArrayList<MovieEntity>()
        movie.add(
            MovieEntity(
                "001",
                "A Star Is Born",
                "Andrea Sandstrom travels back in time to become a movie star. With a time cop on her heels, she just needs to steal her first role to change the course of history.",
                "Elizabeth Cotter, Paul Eenhoorn, Jef Faulker",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/wrFpXMNBRj2PBiN4Z5kix51XaIZ.jpg",
                "Romance, Drama, Music",
                "2h 15m",
                "English",
                "Jan 15, 2019",
                "Bradley Cooper",
                "Eric Roth, Bradley Cooper, Will Fetters",
                "Jon Peters/Bill Gerber/Joint Effort Production",
                "R (Some Sexuality/Nudity|Language Throughout|Substance Abuse",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/DPnessSsWqVXRbKm93PtMjB4Us.jpg",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/asB6CImOsNGA5i9HHt2FFCtP2QJ.jpg",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/1K2IvGXFbKsgkExuUsRvy4F0c9e.jpg",
                false

            )
        )
        movie.add(
            MovieEntity(
                "002",
                "Alita: Battle Angel",
                "Alita is a creation from an age of despair. Found by the mysterious Dr. Ido while trolling for cyborg parts, Alita becomes a lethal, dangerous being. She cannot remember who she is, or where she came from. But to Dr. Ido, the truth is all too clear. She is the one being who can break the cycle of death and destruction left behind from Tiphares. But to accomplish her true purpose, she must fight and kill. And that is where Alita's true significance comes to bear. She is an angel from heaven. She is an angel of death.",
                "Rosa Salazar, Christoph Waltz, Jennifer Connelly",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/xRWht48C2V8XNfzvPehyClOvDni.jpg",
                "Sci Fi, Animation, Action, Adventure, Fantasy",
                "2h 2m",
                "English",
                "Feb 14, 2019",
                "Robert Rodriguez",
                "James Cameron, Laeta Kalogridis",
                "Troublemaker Studios, Lightstorm Entertainment",
                "PG-13 (Sequences of Sci-Fi Violence|Action|Some Language)",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/pc2tCeB99HtmrghAoPKksZkbzUU.jpg",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/2Hhztd4mUEV9Y25rfkXDwzL9QI9.jpg",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/egh1eOHuYgeoqdlLQgaXMl6cPOm.jpg",
                false
            )
        )
        movie.add(
            MovieEntity(
                "003",
                "Aquaman",
                "Born upon the shores of the surface world, Arthur Curry (Jason Momoa) discovers that he is only half human, with the other half of his blood being of Atlanteean descent, thus making him the rightful heir to the throne of the undersea kingdom of Atlantis. However, Arthur learns that Atlantis is being ruled by his malicious half-brother Orm (Patrick Wilson), who seeks to unite the seven underwater kingdoms and wage war upon the surface. With aid from Nuidis Vulko (Willem Dafoe) and the gorgeous Mera (Amber Heard), Arthur must discover the full potential of his true destiny and become Aquaman in order to save Atlantis and the surface from Orm's evil plot.",
                "Jason Momoa, Amber Heard, Willem Dafoe",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/xLPffWMhMj1l50ND3KchMjYoKmE.jpg",
                "Adventure, Action, Fantasy",
                "2h 23m",
                "English",
                "Mar 5, 2019",
                "James Wan",
                "David Leslie Johnson-McGoldrick, Will Beall",
                "Peter Safaran",
                "PG-13 (Sequences of Sci-Fi Violence|Action|Some Language)",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/6dEFBpZH8C8OijsynkSajQT99Pb.jpg",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/1cb5mGzGB6Sj2JPkWt9W16B19Bf.jpg",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/ui8e4sgZAwMPi3hzEO53jyBJF9B.jpg",
                false
            )
        )
        movie.add(
            MovieEntity(
                "004",
                "Cold Persuit",
                "Nels Coxman's quiet life as a snowplow driver comes crashing down when his beloved son dies under mysterious circumstances. His search for the truth soon becomes a quest for revenge against a psychotic drug lord named Viking and his sleazy henchmen. Transformed from upstanding citizen to coldblooded vigilante, Coxman unwittingly sets off a chain of events that includes a kidnapping, a series of deadly misunderstandings and a turf war between Viking and a rival boss.",
                "Liam Neeson, Laura Dern, Micheál Richardson",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/hXgmWPd1SuujRZ4QnKLzrj79PAw.jpg",
                "Action, Mystery And Thriller",
                "1h 58m",
                "English",
                "May 3, 2019",
                "Hans Peter Moland",
                "Frank Baldwin",
                "Mas Films, Paradox Films",
                "R (Sexual References|Drug Material|Some Language|Strong Violence)",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/jrf9LaTFWfLA5DBhFWENFsWh4Y9.jpg",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/gB9PnGEvxKg33OSlcqptQwTBwPE.jpg",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/z9uCzTIAy9pi3r3X2fDGiYuLCXK.jpg",
                false
            )
        )
        movie.add(
            MovieEntity(
                "005",
                "Fantastic Beasts: The Crimes of Grindelwald",
                "In an effort to thwart Grindelwald's plans of raising pure-blood wizards to rule over all non-magical beings, Albus Dumbledore enlists his former student Newt Scamander, who agrees to help, unaware of the dangers that lie ahead. Lines are drawn as love and loyalty are tested, even among the truest friends and family, in an increasingly divided wizarding world.",
                "Eddie Redmayne, Katherine Waterston, Dan Fogler",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/fMMrl8fD9gRCFJvsx0SuFwkEOop.jpg",
                "Fantasy, Adventure",
                "2h 14m",
                "English",
                "Feb 14, 2019",
                "David Yates",
                "J.K. Rowling",
                "Warner Bros., Heyday Films",
                "PG-13 (Sequences of Fantasy Action)",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/fSvG7qzoBBnJUmgtIuMgrK3EQPN.jpg",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/5xndFxJuB2QYmtoYwl1MFtFHM24.jpg",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/7SGZ9EwnFxujmEGrOAYesOyBtwL.jpg",
                false
                )
        )
        movie.add(
            MovieEntity(
                "006",
                "Glass",
                "David Dunn tries to stay one step ahead of the law while delivering vigilante justice on the streets of Philadelphia. His special talents soon put him on a collision course with the Beast -- the psychotic madman who has superhuman strength and 23 distinct personalities. Their epic showdown leads them to an encounter with the mysterious Elijah Price, the criminal mastermind who holds critical secrets for both men.",
                "James McAvoy, Bruce Willis, Samuel L. Jackson",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/svIDTNUoajS8dLEo7EosxvyAsgJ.jpg",
                "Drama, Mystery And Thriller",
                "2h 9m",
                "English",
                "Apr 2, 2019",
                "M. Night Shyamalan",
                "M. Night Shyamalan",
                "Blinding Edge Pictures, Blumhouse Productions",
                "PG-13 (Some Bloody Images|Language|Thematic Elements|Violence)",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/vB6qYlFXgONGVwwxWXE4gf0F8SQ.jpg",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/caX3KtMU42EP3VLRFFBwqIIrch5.jpg",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/mXN4Gw9tZJVKrLJHde2IcUHmV3P.jpg",
                false
            )
        )
        movie.add(
            MovieEntity(
                "007",
                "How to Train Your Dragon: The Hidden World",
                "When the sudden appearance of a female Light Fury coincides with the darkest threat their village has ever faced, Hiccup and Toothless must journey to a hidden world thought only to exist in myth. The two friends will soon discover their true destinies as dragon and rider fight together to protect everything they've grown to treasure.",
                "Jay Baruchel, America Ferrera, F. Murray Abraham",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/xvx4Yhf0DVH8G4LzNISpMfFBDy2.jpg",
                "Fantasy, Comedy, Adventure, Animation, Kids And Family",
                "1h 44m",
                "English",
                "Apr 30, 2019",
                "Dean DeBlois",
                "Dean DeBlois",
                "DreamWorks Animation",
                "PG (Some Mild Rude Humor|Adventure Action)",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/hTg6RJMxpxcsYzmdre81TznDATZ.jpg",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/7F84Lh2lKpvkM3EiOvqqvlOmw93.jpg",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/nRbIHvVpz5jfQbKlnBAJN10qaLo.jpg",
                false
            )
        )
        movie.add(
            MovieEntity(
                "008",
                "Avengers: Infinity War",
                "Iron Man, Thor, the Hulk and the rest of the Avengers unite to battle their most powerful enemy yet -- the evil Thanos. On a mission to collect all six Infinity Stones, Thanos plans to use the artifacts to inflict his twisted will on reality. The fate of the planet and existence itself has never been more uncertain as everything the Avengers have fought for has led up to this moment.",
                "Robert Downey Jr., Chris Hemsworth, Mark Ruffalo",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/7WsyChQLEftFiDOVTGkv3hFpyyt.jpg",
                "Fantasy, Sci Fi, Action, Adventure",
                "2h 29m",
                "English",
                "Jul 31, 2018",
                "Anthony Russo, Joe Russo",
                "Christopher Markus, Stephen McFeely",
                "Marvels Studios",
                "PG-13 (Intense Sci-Fi Violence|Action Throughout|Language|Some Crude References)",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/5qHNjhtjMD4YWH3UP0rm4tKwxCL.jpg",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/jpurJ9jAcLCYjgHHfYF32m3zJYm.jpg",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/mODcczqQyKuphfFAoBZGhxgnNfs.jpg",
                false
            )
        )
        movie.add(
            MovieEntity(
                "009",
                "Marry Queen of Scots",
                "Mary Stuart's (Saoirse Ronan's) attempt to overthrow her cousin Elizabeth I (Margot Robbie), Queen of England, finds her condemned to years of imprisonment before facing execution.",
                "Saoirse Ronan, Margot Robbie, Jack Lowden",
                "https://m.media-amazon.com/images/M/MV5BNDVmOGI4MTMtYmNmNC00MTliLTlkYjQtYmU2N2EyNDk2YTAwXkEyXkFqcGdeQXVyMjM4NTM5NDY@._V1_.jpg",
                "History, Biography, Drama",
                "2h 4m",
                "English",
                "Feb 19, 2019",
                "Josie Rourke",
                "Beau Willimon",
                "Focus Features, Perfect World Pictures, Working Title Films",
                "R (Some Violence and Sexuality)",
                "https://resizing.flixster.com/fMmSYt4VeVBgEWcWSAgHTgeHzwA=/506x652/v2/https://flxt.tmsimg.com/v9/AllPhotos/491010/491010_v9_bc.jpg",
                "https://cdn.idntimes.com/content-images/post/20200117/margot-robbie-bombshell-press-conference-photoshoot-more-photos-21-696ad9c13d2c272604c0e58abb70c12b.jpg",
                "https://www.themoviedb.org/t/p/original/5bW2477C2Rc4tCpCjyKFITMXOAt.jpg",
                false
            )
        )
        movie.add(
            MovieEntity(
                "010",
                "Ralph Breaks the Internet",
                "Video game bad guy Ralph and fellow misfit Vanellope von Schweetz must risk it all by traveling to the World Wide Web in search of a replacement part to save Vanellope's video game, \"Sugar Rush.\" In way over their heads, Ralph and Vanellope rely on the citizens of the internet -- the netizens -- to help navigate their way, including an entrepreneur named Yesss, who is the head algorithm and the heart and soul of trend-making site BuzzzTube.",
                "John C. Reilly, Sarah Silverman, Gal Gadot",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/qEnH5meR381iMpmCumAIMswcQw2.jpg",
                "Adventure, Animation, Kids And Family, Comedy",
                "1h 52m",
                "English",
                "Feb 12, 2019",
                "Phil Johnston, Rich Moore",
                "Phil Johnston, Pamela Ribon",
                "Walt Disney Animation Studios",
                "PG (Some Action and Rude Humor)",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/iDQ8w4qcxU3le5ZWoCKpHs1QNok.jpg",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/g5G711XyVokJm2RoItpkaHa8mkQ.jpg",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/cIi5pCTdVpD4Hn0OEcJhJeNKYMw.jpg",
                false
            )
        )
        return movie
    }

    fun generateDummyRemoteMovie(): List<MovieResponse> {
        val movie = ArrayList<MovieResponse>()
        movie.add(
            MovieResponse(
                "001",
                "A Star Is Born",
                "Andrea Sandstrom travels back in time to become a movie star. With a time cop on her heels, she just needs to steal her first role to change the course of history.",
                "Elizabeth Cotter, Paul Eenhoorn, Jef Faulker",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/wrFpXMNBRj2PBiN4Z5kix51XaIZ.jpg",
                "Romance, Drama, Music",
                "2h 15m",
                "English",
                "Jan 15, 2019",
                "Bradley Cooper",
                "Eric Roth, Bradley Cooper, Will Fetters",
                "Jon Peters/Bill Gerber/Joint Effort Production",
                "R (Some Sexuality/Nudity|Language Throughout|Substance Abuse",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/DPnessSsWqVXRbKm93PtMjB4Us.jpg",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/asB6CImOsNGA5i9HHt2FFCtP2QJ.jpg",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/1K2IvGXFbKsgkExuUsRvy4F0c9e.jpg"

            )
        )
        movie.add(
            MovieResponse(
                "002",
                "Alita: Battle Angel",
                "Alita is a creation from an age of despair. Found by the mysterious Dr. Ido while trolling for cyborg parts, Alita becomes a lethal, dangerous being. She cannot remember who she is, or where she came from. But to Dr. Ido, the truth is all too clear. She is the one being who can break the cycle of death and destruction left behind from Tiphares. But to accomplish her true purpose, she must fight and kill. And that is where Alita's true significance comes to bear. She is an angel from heaven. She is an angel of death.",
                "Rosa Salazar, Christoph Waltz, Jennifer Connelly",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/xRWht48C2V8XNfzvPehyClOvDni.jpg",
                "Sci Fi, Animation, Action, Adventure, Fantasy",
                "2h 2m",
                "English",
                "Feb 14, 2019",
                "Robert Rodriguez",
                "James Cameron, Laeta Kalogridis",
                "Troublemaker Studios, Lightstorm Entertainment",
                "PG-13 (Sequences of Sci-Fi Violence|Action|Some Language)",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/pc2tCeB99HtmrghAoPKksZkbzUU.jpg",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/2Hhztd4mUEV9Y25rfkXDwzL9QI9.jpg",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/egh1eOHuYgeoqdlLQgaXMl6cPOm.jpg",
            )
        )
        movie.add(
            MovieResponse(
                "003",
                "Aquaman",
                "Born upon the shores of the surface world, Arthur Curry (Jason Momoa) discovers that he is only half human, with the other half of his blood being of Atlanteean descent, thus making him the rightful heir to the throne of the undersea kingdom of Atlantis. However, Arthur learns that Atlantis is being ruled by his malicious half-brother Orm (Patrick Wilson), who seeks to unite the seven underwater kingdoms and wage war upon the surface. With aid from Nuidis Vulko (Willem Dafoe) and the gorgeous Mera (Amber Heard), Arthur must discover the full potential of his true destiny and become Aquaman in order to save Atlantis and the surface from Orm's evil plot.",
                "Jason Momoa, Amber Heard, Willem Dafoe",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/xLPffWMhMj1l50ND3KchMjYoKmE.jpg",
                "Adventure, Action, Fantasy",
                "2h 23m",
                "English",
                "Mar 5, 2019",
                "James Wan",
                "David Leslie Johnson-McGoldrick, Will Beall",
                "Peter Safaran",
                "PG-13 (Sequences of Sci-Fi Violence|Action|Some Language)",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/6dEFBpZH8C8OijsynkSajQT99Pb.jpg",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/1cb5mGzGB6Sj2JPkWt9W16B19Bf.jpg",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/ui8e4sgZAwMPi3hzEO53jyBJF9B.jpg",
            )
        )
        movie.add(
            MovieResponse(
                "004",
                "Cold Persuit",
                "Nels Coxman's quiet life as a snowplow driver comes crashing down when his beloved son dies under mysterious circumstances. His search for the truth soon becomes a quest for revenge against a psychotic drug lord named Viking and his sleazy henchmen. Transformed from upstanding citizen to coldblooded vigilante, Coxman unwittingly sets off a chain of events that includes a kidnapping, a series of deadly misunderstandings and a turf war between Viking and a rival boss.",
                "Liam Neeson, Laura Dern, Micheál Richardson",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/hXgmWPd1SuujRZ4QnKLzrj79PAw.jpg",
                "Action, Mystery And Thriller",
                "1h 58m",
                "English",
                "May 3, 2019",
                "Hans Peter Moland",
                "Frank Baldwin",
                "Mas Films, Paradox Films",
                "R (Sexual References|Drug Material|Some Language|Strong Violence)",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/jrf9LaTFWfLA5DBhFWENFsWh4Y9.jpg",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/gB9PnGEvxKg33OSlcqptQwTBwPE.jpg",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/z9uCzTIAy9pi3r3X2fDGiYuLCXK.jpg"
            )
        )
        movie.add(
            MovieResponse(
                "005",
                "Fantastic Beasts: The Crimes of Grindelwald",
                "In an effort to thwart Grindelwald's plans of raising pure-blood wizards to rule over all non-magical beings, Albus Dumbledore enlists his former student Newt Scamander, who agrees to help, unaware of the dangers that lie ahead. Lines are drawn as love and loyalty are tested, even among the truest friends and family, in an increasingly divided wizarding world.",
                "Eddie Redmayne, Katherine Waterston, Dan Fogler",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/fMMrl8fD9gRCFJvsx0SuFwkEOop.jpg",
                "Fantasy, Adventure",
                "2h 14m",
                "English",
                "Feb 14, 2019",
                "David Yates",
                "J.K. Rowling",
                "Warner Bros., Heyday Films",
                "PG-13 (Sequences of Fantasy Action)",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/fSvG7qzoBBnJUmgtIuMgrK3EQPN.jpg",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/5xndFxJuB2QYmtoYwl1MFtFHM24.jpg",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/7SGZ9EwnFxujmEGrOAYesOyBtwL.jpg"
            )
        )
        movie.add(
            MovieResponse(
                "006",
                "Glass",
                "David Dunn tries to stay one step ahead of the law while delivering vigilante justice on the streets of Philadelphia. His special talents soon put him on a collision course with the Beast -- the psychotic madman who has superhuman strength and 23 distinct personalities. Their epic showdown leads them to an encounter with the mysterious Elijah Price, the criminal mastermind who holds critical secrets for both men.",
                "James McAvoy, Bruce Willis, Samuel L. Jackson",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/svIDTNUoajS8dLEo7EosxvyAsgJ.jpg",
                "Drama, Mystery And Thriller",
                "2h 9m",
                "English",
                "Apr 2, 2019",
                "M. Night Shyamalan",
                "M. Night Shyamalan",
                "Blinding Edge Pictures, Blumhouse Productions",
                "PG-13 (Some Bloody Images|Language|Thematic Elements|Violence)",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/vB6qYlFXgONGVwwxWXE4gf0F8SQ.jpg",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/caX3KtMU42EP3VLRFFBwqIIrch5.jpg",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/mXN4Gw9tZJVKrLJHde2IcUHmV3P.jpg"
            )
        )
        movie.add(
            MovieResponse(
                "007",
                "How to Train Your Dragon: The Hidden World",
                "When the sudden appearance of a female Light Fury coincides with the darkest threat their village has ever faced, Hiccup and Toothless must journey to a hidden world thought only to exist in myth. The two friends will soon discover their true destinies as dragon and rider fight together to protect everything they've grown to treasure.",
                "Jay Baruchel, America Ferrera, F. Murray Abraham",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/xvx4Yhf0DVH8G4LzNISpMfFBDy2.jpg",
                "Fantasy, Comedy, Adventure, Animation, Kids And Family",
                "1h 44m",
                "English",
                "Apr 30, 2019",
                "Dean DeBlois",
                "Dean DeBlois",
                "DreamWorks Animation",
                "PG (Some Mild Rude Humor|Adventure Action)",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/hTg6RJMxpxcsYzmdre81TznDATZ.jpg",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/7F84Lh2lKpvkM3EiOvqqvlOmw93.jpg",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/nRbIHvVpz5jfQbKlnBAJN10qaLo.jpg"
            )
        )
        movie.add(
            MovieResponse(
                "008",
                "Avengers: Infinity War",
                "Iron Man, Thor, the Hulk and the rest of the Avengers unite to battle their most powerful enemy yet -- the evil Thanos. On a mission to collect all six Infinity Stones, Thanos plans to use the artifacts to inflict his twisted will on reality. The fate of the planet and existence itself has never been more uncertain as everything the Avengers have fought for has led up to this moment.",
                "Robert Downey Jr., Chris Hemsworth, Mark Ruffalo",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/7WsyChQLEftFiDOVTGkv3hFpyyt.jpg",
                "Fantasy, Sci Fi, Action, Adventure",
                "2h 29m",
                "English",
                "Jul 31, 2018",
                "Anthony Russo, Joe Russo",
                "Christopher Markus, Stephen McFeely",
                "Marvels Studios",
                "PG-13 (Intense Sci-Fi Violence|Action Throughout|Language|Some Crude References)",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/5qHNjhtjMD4YWH3UP0rm4tKwxCL.jpg",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/jpurJ9jAcLCYjgHHfYF32m3zJYm.jpg",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/mODcczqQyKuphfFAoBZGhxgnNfs.jpg"
            )
        )
        movie.add(
            MovieResponse(
                "009",
                "Marry Queen of Scots",
                "Mary Stuart's (Saoirse Ronan's) attempt to overthrow her cousin Elizabeth I (Margot Robbie), Queen of England, finds her condemned to years of imprisonment before facing execution.",
                "Saoirse Ronan, Margot Robbie, Jack Lowden",
                "https://m.media-amazon.com/images/M/MV5BNDVmOGI4MTMtYmNmNC00MTliLTlkYjQtYmU2N2EyNDk2YTAwXkEyXkFqcGdeQXVyMjM4NTM5NDY@._V1_.jpg",
                "History, Biography, Drama",
                "2h 4m",
                "English",
                "Feb 19, 2019",
                "Josie Rourke",
                "Beau Willimon",
                "Focus Features, Perfect World Pictures, Working Title Films",
                "R (Some Violence and Sexuality)",
                "https://resizing.flixster.com/fMmSYt4VeVBgEWcWSAgHTgeHzwA=/506x652/v2/https://flxt.tmsimg.com/v9/AllPhotos/491010/491010_v9_bc.jpg",
                "https://cdn.idntimes.com/content-images/post/20200117/margot-robbie-bombshell-press-conference-photoshoot-more-photos-21-696ad9c13d2c272604c0e58abb70c12b.jpg",
                "https://www.themoviedb.org/t/p/original/5bW2477C2Rc4tCpCjyKFITMXOAt.jpg"
            )
        )
        movie.add(
            MovieResponse(
                "010",
                "Ralph Breaks the Internet",
                "Video game bad guy Ralph and fellow misfit Vanellope von Schweetz must risk it all by traveling to the World Wide Web in search of a replacement part to save Vanellope's video game, \"Sugar Rush.\" In way over their heads, Ralph and Vanellope rely on the citizens of the internet -- the netizens -- to help navigate their way, including an entrepreneur named Yesss, who is the head algorithm and the heart and soul of trend-making site BuzzzTube.",
                "John C. Reilly, Sarah Silverman, Gal Gadot",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/qEnH5meR381iMpmCumAIMswcQw2.jpg",
                "Adventure, Animation, Kids And Family, Comedy",
                "1h 52m",
                "English",
                "Feb 12, 2019",
                "Phil Johnston, Rich Moore",
                "Phil Johnston, Pamela Ribon",
                "Walt Disney Animation Studios",
                "PG (Some Action and Rude Humor)",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/iDQ8w4qcxU3le5ZWoCKpHs1QNok.jpg",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/g5G711XyVokJm2RoItpkaHa8mkQ.jpg",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/cIi5pCTdVpD4Hn0OEcJhJeNKYMw.jpg"
            )
        )
        return movie
    }


    fun generateDummySeries(): List<SeriesEntity> {
        val series = ArrayList<SeriesEntity>()

        series.add(
            SeriesEntity(
                "011",
                "Game of Thrones",
                "Game of Thrones is an HBO series that tells the story of a medieval country's civil war. ... When the story begins, a decade-long summer is ending, and winter looms as characters battle to claim the \"Iron Throne,\" the seat of the king of the Seven Kingdoms, the regime that rules all but the northern tip of Westeros.",
                "Sean Bean, Jim Broadbent, Mark Addy",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/u3bZgnGQ9T01sWNhyveQz0wH0Hl.jpg",
                "Science Fiction, Fantasy",
                "10 episodes",
                "English",
                "Apr 17, 2011",
                "David Benioff, D.B. Weiss",
                "HBO",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/86jeYFV40KctQMDQIWhJ5oviNGj.jpg",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/1hUAKYvSi4vZSYvTnD2TlqF6VVx.jpg",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/lRsRgnksAhBRXwAB68MFjmTtLrk.jpg",
                false
            )
        )
        series.add(
            SeriesEntity(
                "012",
                "Imperfect the Series",
                "This series takes place a year before the film Imperfect. At that time Dika had not yet met Rara, and was working on a photography project outside the city. The common thread of conflict is in Neti's love story.",
                "Kiky Saputri, Aci Resti, Neneng Wulandari",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/eV4sSiqhQsW1dqNuqgyuyll0Bzw.jpg",
                "Comedy, Drama",
                "12 episodes",
                "Indonesia",
                "27 January 2021",
                "Ernest Prakasa",
                "StarVision Plus",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/vqGy75o35RBQHGmWAQtGtS3bR8E.jpg",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/fOlXmM66SY7Uf69HQYlfgZ3CNdw.jpg",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/jJfxyeq1lUMwbk2gAmS6IjWlBH3.jpg",
                false
            )
        )
        series.add(
            SeriesEntity(
                "013",
                "Kingdom",
                "In this period zombie thriller, a Korean prince is sent out on a mission to investigate an outbreak that threatens his kingdom.",
                "Ji-Hoon Ju, Doona Bae, Ryu Seung-ryong",
                "https://i.pinimg.com/564x/75/be/12/75be125f83f2f3f2a6dd67da6307dfd0.jpg",
                "Horror",
                "6 episodes",
                "Korean",
                "Jan 25, 2019",
                "Kim Seong-hun, Kim Eun-hee",
                "AStory",
                "https://i.mydramalist.com/pOrorf.jpg",
                "https://pbs.twimg.com/media/DyNj3kvUcAAatck.jpg",
                "https://www.layar.id/wp-content/uploads/2019/03/ryu.jpg",
                false
            )
        )
        series.add(
            SeriesEntity(
                "014",
                "My Lecture, My Husband",
                "Inggit's life is changed when her father is sick and sets her up with Mr. Arya, the most hated lecturer at her campus, and ask Inggit to marry him.",
                "Reza Rahadian, Prilly Latuconsina, Kevin Ardillova",
                "https://m.media-amazon.com/images/M/MV5BZmQxZTVkMDctMWQzZS00YzBjLTg4ZmUtZTNkNDZjZGM5MGZlXkEyXkFqcGdeQXVyMTEzMTI1Mjk3._V1_.jpg",
                "Drama, Romance",
                "8 episodes",
                "Indonesia",
                "11 December 2020",
                "Monty Tiwa",
                "MD Entertainment",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/vqGy75o35RBQHGmWAQtGtS3bR8E.jpg",
                "https://images.moviefit.me/p/o/77332-prilly-latuconsina.jpg",
                "https://cdns.klimg.com/diadona.id/resources/photonews/2020/12/28/30421/664xauto-10-pesona-kevin-ardillova-pacar-prilly-latuconsina-dalam-serial-my-lecturer-my-husband-201228p-004.jpg",
                false
            )
        )
        series.add(
            SeriesEntity(
                "015",
                "Money Heist (La Casa De Papel)",
                "An enigmatic character called The Professor plans something unique when he plots to carry out the biggest robbery in history.",
                "Álvaro Morte, Úrsula Corberó, Pedro Alonso",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/MoEKaPFHABtA1xKoOteirGaHl1.jpg",
                "Drama, Action, Crime, Mystery",
                "13 episodes",
                "Spanish",
                "2 May 2017",
                "Álex Pina",
                "Atresmedia, Vancouver Media",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/wZkK15LnloSAhzs1jxI3AZbR6f0.jpg",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/2TGPhdpRC5wjdFEJqnLYiN5kbwg.jpg",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/b3N8AXDUgG3rJzbTSYCh5SFAEWk.jpg",
                false
            )
        )
        series.add(
            SeriesEntity(
                "016",
                "The Queen's Gambit",
                "Based on the novel by Walter Tevis, the Netflix limited series drama The Queen's Gambit is a coming-of-age story that explores the true cost of genius. Abandoned and entrusted to a Kentucky orphanage in the late 1950s, a young Beth Harmon (Anya Taylor-Joy) discovers an astonishing talent for chess while developing an addiction to tranquilizers provided by the state as a sedative for the children.",
                "Anya Taylor-Joy, Marielle Heller, Thomas Brodie-Sangster",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/zU0htwkhNvBQdVSIKB9s6hgVeFK.jpg",
                "Drama",
                "7 episodes",
                " French, Spanish, Russian, English",
                "23 October 2020",
                "Scott Frank, Allan Scott",
                "Flitcraft, Wonderful Films, Netflix",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/9j48tPgy4Exrfx0gFm88Pp0rzr4.jpg",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/yZFata0EVr7TbIAz8vZFyiDKDts.jpg",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/3YMRpIF6fPH1RDNOG4Do1Yqq4l5.jpg",
                false
            )
        )
        series.add(
            SeriesEntity(
                "017",
                "Start-Up",
                "Young entrepreneurs aspiring to launch virtual dreams into reality compete for success and love in the cutthroat world of Korea's high-tech industry.",
                "Bae Suzy, Nam Joo-Hyuk, Kim Seon-Ho",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/hxJQ3A2wtreuWDnVBbzzXI3YlOE.jpg",
                "Comedy, Drama, Romance",
                "16 episodes",
                "Korean",
                "17 October 2020",
                "Oh Choong-Hwan",
                "Hi Story D&c, Studio Dragon",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/gPERVLaXrorr5w2fygkgdCZtAXf.jpg",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/zQdkQio6SyNpKoudDLc17BRQDGD.jpg",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/dW7cefpIqy48gughdHfRrbGj64D.jpg",
                false
            )
        )
        series.add(
            SeriesEntity(
                "018",
                "Stranger Things",
                "A love letter to the '80s classics that captivated a generation, Stranger Things is set in 1983 Indiana, where a young boy vanishes into thin air. As friends, family and local police search for answers, they are drawn into an extraordinary mystery involving top-secret government experiments, terrifying supernatural forces and one very strange little girl.",
                "Winona Ryder, David Harbour, Millie Bobby Brown",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/x2LSRK2Cm7MZhjluni1msVJ3wDF.jpg",
                "Drama, Fantasy, Horror, Mystery, Sci-Fi, Thriller",
                "8 episodes",
                "English, Russian",
                "15 July 2016",
                "Matt Duffer, Ross Duffer",
                "21 Laps Entertainment, Monkey Massacre, Netflix",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/5yteOSY2lgGOgSWmRTlxqfY59MS.jpg",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/chPekukMF5SNnW6b22NbYPqAStr.jpg",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/yzfxLMcBMusKzZp9f1Z9Ags8WML.jpg",
                false
            )
        )
        series.add(
            SeriesEntity(
                "019",
                "The End of the F***ing World",
                "James is 17 and is pretty sure he is a psychopath. Alyssa, also 17, is the cool and moody new girl at school. The pair make a connection and she persuades him to embark on a road trip in search of her real father.",
                "Jessica Barden, Alex Lawther, Steve Oram",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/vZQKQcB5n91c6tBofAVXq88Uuti.jpg",
                "Adventure, Comedy, Crime, Drama, Romance, Thriller",
                "8 episodes",
                "English",
                "24 October 2017",
                "Charles S. Forsman",
                "Clerkenwell Films, Dominic Buchanan Productions",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/dmnF5l3yIp6Bn2xNgyyV7XdQYdU.jpg",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/A4WddlGjgLxcQfrILXmfHeaBD9p.jpg",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/lRLC2evuvWxFtq0aq7Te4I1L9MS.jpg",
                false
            )
        )
        series.add(
            SeriesEntity(
                "020",
                "The Umbrella Academy",
                "On the same day in 1989, forty-three infants are inexplicably born to random, unconnected women who showed no signs of pregnancy the day before. Seven are adopted by Sir Reginald Hargreeves, a billionaire industrialist, who creates The Umbrella Academy and prepares his \"children\" to save the world. But not everything went according to plan. In their teenage years, the family fractured and the team disbanded. Now, the six surviving thirty-something members reunite upon the news of Hargreeve's passing. Luther, Diego, Allison, Klaus, Vanya and Number Five work together to solve a mystery surrounding their father's death.",
                "Tom Hopper, Emmy Raver-Lampman, Eden Cupid",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/scZlQQYnDVlnpxFTxaIv2g0BWnL.jpg",
                "Action, Adventure, Comedy, Drama, Fantasy, Sci-Fi",
                "10 episodes",
                "English",
                "15 February 2019",
                "Steve Blackman, Jeremy Slater",
                " Dark Horse Entertainment, Netflix, Universal Cable Productions",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/qS8F31xn6ZoNBTOvcXZfWewgma2.jpg",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/cBkHUBzqoqrnkxDXWlqQmm91pD2.jpg",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/2rum1TvJyB13RMERueiH1MrBmjZ.jpg",
                false
            )
        )
        return series
    }

    fun generateDummyRemoteSeries(): List<SeriesResponse> {
        val series = ArrayList<SeriesResponse>()

        series.add(
            SeriesResponse(
                "011",
                "Game of Thrones",
                "Game of Thrones is an HBO series that tells the story of a medieval country's civil war. ... When the story begins, a decade-long summer is ending, and winter looms as characters battle to claim the \"Iron Throne,\" the seat of the king of the Seven Kingdoms, the regime that rules all but the northern tip of Westeros.",
                "Sean Bean, Jim Broadbent, Mark Addy",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/u3bZgnGQ9T01sWNhyveQz0wH0Hl.jpg",
                "Science Fiction, Fantasy",
                "10 episodes",
                "English",
                "Apr 17, 2011",
                "David Benioff, D.B. Weiss",
                "HBO",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/86jeYFV40KctQMDQIWhJ5oviNGj.jpg",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/1hUAKYvSi4vZSYvTnD2TlqF6VVx.jpg",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/lRsRgnksAhBRXwAB68MFjmTtLrk.jpg"
            )
        )
        series.add(
            SeriesResponse(
                "012",
                "Imperfect the Series",
                "This series takes place a year before the film Imperfect. At that time Dika had not yet met Rara, and was working on a photography project outside the city. The common thread of conflict is in Neti's love story.",
                "Kiky Saputri, Aci Resti, Neneng Wulandari",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/eV4sSiqhQsW1dqNuqgyuyll0Bzw.jpg",
                "Comedy, Drama",
                "12 episodes",
                "Indonesia",
                "27 January 2021",
                "Ernest Prakasa",
                "StarVision Plus",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/vqGy75o35RBQHGmWAQtGtS3bR8E.jpg",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/fOlXmM66SY7Uf69HQYlfgZ3CNdw.jpg",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/jJfxyeq1lUMwbk2gAmS6IjWlBH3.jpg"
            )
        )
        series.add(
            SeriesResponse(
                "013",
                "Kingdom",
                "In this period zombie thriller, a Korean prince is sent out on a mission to investigate an outbreak that threatens his kingdom.",
                "Ji-Hoon Ju, Doona Bae, Ryu Seung-ryong",
                "https://i.pinimg.com/564x/75/be/12/75be125f83f2f3f2a6dd67da6307dfd0.jpg",
                "Horror",
                "6 episodes",
                "Korean",
                "Jan 25, 2019",
                "Kim Seong-hun, Kim Eun-hee",
                "AStory",
                "https://i.mydramalist.com/pOrorf.jpg",
                "https://pbs.twimg.com/media/DyNj3kvUcAAatck.jpg",
                "https://www.layar.id/wp-content/uploads/2019/03/ryu.jpg"
            )
        )
        series.add(
            SeriesResponse(
                "014",
                "My Lecture, My Husband",
                "Inggit's life is changed when her father is sick and sets her up with Mr. Arya, the most hated lecturer at her campus, and ask Inggit to marry him.",
                "Reza Rahadian, Prilly Latuconsina, Kevin Ardillova",
                "https://m.media-amazon.com/images/M/MV5BZmQxZTVkMDctMWQzZS00YzBjLTg4ZmUtZTNkNDZjZGM5MGZlXkEyXkFqcGdeQXVyMTEzMTI1Mjk3._V1_.jpg",
                "Drama, Romance",
                "8 episodes",
                "Indonesia",
                "11 December 2020",
                "Monty Tiwa",
                "MD Entertainment",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/vqGy75o35RBQHGmWAQtGtS3bR8E.jpg",
                "https://images.moviefit.me/p/o/77332-prilly-latuconsina.jpg",
                "https://cdns.klimg.com/diadona.id/resources/photonews/2020/12/28/30421/664xauto-10-pesona-kevin-ardillova-pacar-prilly-latuconsina-dalam-serial-my-lecturer-my-husband-201228p-004.jpg"
            )
        )
        series.add(
            SeriesResponse(
                "015",
                "Money Heist (La Casa De Papel)",
                "An enigmatic character called The Professor plans something unique when he plots to carry out the biggest robbery in history.",
                "Álvaro Morte, Úrsula Corberó, Pedro Alonso",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/MoEKaPFHABtA1xKoOteirGaHl1.jpg",
                "Drama, Action, Crime, Mystery",
                "13 episodes",
                "Spanish",
                "2 May 2017",
                "Álex Pina",
                "Atresmedia, Vancouver Media",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/wZkK15LnloSAhzs1jxI3AZbR6f0.jpg",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/2TGPhdpRC5wjdFEJqnLYiN5kbwg.jpg",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/b3N8AXDUgG3rJzbTSYCh5SFAEWk.jpg"
            )
        )
        series.add(
            SeriesResponse(
                "016",
                "The Queen's Gambit",
                "Based on the novel by Walter Tevis, the Netflix limited series drama The Queen's Gambit is a coming-of-age story that explores the true cost of genius. Abandoned and entrusted to a Kentucky orphanage in the late 1950s, a young Beth Harmon (Anya Taylor-Joy) discovers an astonishing talent for chess while developing an addiction to tranquilizers provided by the state as a sedative for the children.",
                "Anya Taylor-Joy, Marielle Heller, Thomas Brodie-Sangster",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/zU0htwkhNvBQdVSIKB9s6hgVeFK.jpg",
                "Drama",
                "7 episodes",
                " French, Spanish, Russian, English",
                "23 October 2020",
                "Scott Frank, Allan Scott",
                "Flitcraft, Wonderful Films, Netflix",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/9j48tPgy4Exrfx0gFm88Pp0rzr4.jpg",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/yZFata0EVr7TbIAz8vZFyiDKDts.jpg",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/3YMRpIF6fPH1RDNOG4Do1Yqq4l5.jpg"
            )
        )
        series.add(
            SeriesResponse(
                "017",
                "Start-Up",
                "Young entrepreneurs aspiring to launch virtual dreams into reality compete for success and love in the cutthroat world of Korea's high-tech industry.",
                "Bae Suzy, Nam Joo-Hyuk, Kim Seon-Ho",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/hxJQ3A2wtreuWDnVBbzzXI3YlOE.jpg",
                "Comedy, Drama, Romance",
                "16 episodes",
                "Korean",
                "17 October 2020",
                "Oh Choong-Hwan",
                "Hi Story D&c, Studio Dragon",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/gPERVLaXrorr5w2fygkgdCZtAXf.jpg",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/zQdkQio6SyNpKoudDLc17BRQDGD.jpg",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/dW7cefpIqy48gughdHfRrbGj64D.jpg"
            )
        )
        series.add(
            SeriesResponse(
                "018",
                "Stranger Things",
                "A love letter to the '80s classics that captivated a generation, Stranger Things is set in 1983 Indiana, where a young boy vanishes into thin air. As friends, family and local police search for answers, they are drawn into an extraordinary mystery involving top-secret government experiments, terrifying supernatural forces and one very strange little girl.",
                "Winona Ryder, David Harbour, Millie Bobby Brown",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/x2LSRK2Cm7MZhjluni1msVJ3wDF.jpg",
                "Drama, Fantasy, Horror, Mystery, Sci-Fi, Thriller",
                "8 episodes",
                "English, Russian",
                "15 July 2016",
                "Matt Duffer, Ross Duffer",
                "21 Laps Entertainment, Monkey Massacre, Netflix",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/5yteOSY2lgGOgSWmRTlxqfY59MS.jpg",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/chPekukMF5SNnW6b22NbYPqAStr.jpg",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/yzfxLMcBMusKzZp9f1Z9Ags8WML.jpg"
            )
        )
        series.add(
            SeriesResponse(
                "019",
                "The End of the F***ing World",
                "James is 17 and is pretty sure he is a psychopath. Alyssa, also 17, is the cool and moody new girl at school. The pair make a connection and she persuades him to embark on a road trip in search of her real father.",
                "Jessica Barden, Alex Lawther, Steve Oram",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/vZQKQcB5n91c6tBofAVXq88Uuti.jpg",
                "Adventure, Comedy, Crime, Drama, Romance, Thriller",
                "8 episodes",
                "English",
                "24 October 2017",
                "Charles S. Forsman",
                "Clerkenwell Films, Dominic Buchanan Productions",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/dmnF5l3yIp6Bn2xNgyyV7XdQYdU.jpg",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/A4WddlGjgLxcQfrILXmfHeaBD9p.jpg",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/lRLC2evuvWxFtq0aq7Te4I1L9MS.jpg"
            )
        )
        series.add(
            SeriesResponse(
                "020",
                "The Umbrella Academy",
                "On the same day in 1989, forty-three infants are inexplicably born to random, unconnected women who showed no signs of pregnancy the day before. Seven are adopted by Sir Reginald Hargreeves, a billionaire industrialist, who creates The Umbrella Academy and prepares his \"children\" to save the world. But not everything went according to plan. In their teenage years, the family fractured and the team disbanded. Now, the six surviving thirty-something members reunite upon the news of Hargreeve's passing. Luther, Diego, Allison, Klaus, Vanya and Number Five work together to solve a mystery surrounding their father's death.",
                "Tom Hopper, Emmy Raver-Lampman, Eden Cupid",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/scZlQQYnDVlnpxFTxaIv2g0BWnL.jpg",
                "Action, Adventure, Comedy, Drama, Fantasy, Sci-Fi",
                "10 episodes",
                "English",
                "15 February 2019",
                "Steve Blackman, Jeremy Slater",
                " Dark Horse Entertainment, Netflix, Universal Cable Productions",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/qS8F31xn6ZoNBTOvcXZfWewgma2.jpg",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/cBkHUBzqoqrnkxDXWlqQmm91pD2.jpg",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/2rum1TvJyB13RMERueiH1MrBmjZ.jpg"
            )
        )
        return series
    }
}