package com.example.tombenkemounandroidkotlin

class DataSource{

    companion object{

        fun createDataSet(): ArrayList<BlogPost>{
            val list = ArrayList<BlogPost>()
            list.add(
                BlogPost(
                    "Neymar",
                    "",
                    "https://user-images.githubusercontent.com/65448513/103319916-d5760080-4a33-11eb-97dd-948086fc2326.png",
                    "Attaquant  Numéro:10 "
                )
            )
            list.add(
                BlogPost(
                    "Kylian Mpappé",
                    "",
                    "https://user-images.githubusercontent.com/65448513/103320588-2f77c580-4a36-11eb-9d94-2a3d8ac80596.png",
                    "Attaquant  Numéro:9 "
                )
            )

            list.add(
                BlogPost(
                    "Angel Dimaria",
                    "",
                    "https://user-images.githubusercontent.com/65448513/103320589-33a3e300-4a36-11eb-88c7-4cb3e7a9e41c.jpg",
                    "Attaquant  Numéro:11 "
                )
            )
            list.add(
                BlogPost(
                    "Marco Verrati",
                    "",
                    "https://user-images.githubusercontent.com/65448513/103321014-00faea00-4a38-11eb-82db-5ac609675bb0.png",
                    "Milieu de terrain  Numéro:6 "
                )
            )
            list.add(
                BlogPost(
                    "Presnel Kimpembe",
                    "",
                    "https://user-images.githubusercontent.com/65448513/103321078-491a0c80-4a38-11eb-8bab-9cc8a70898f2.png",
                    "Défenseur  Numéro:3 "
                )
            )
            list.add(
                BlogPost(
                    "Marquinhos",
                    "",
                    "https://user-images.githubusercontent.com/65448513/103320890-74e8c280-4a37-11eb-9177-4cb2536024cb.png",
                    "Défenseur  Numéro:5 "
                )
            )
            list.add(
                BlogPost(
                    "Keylor Navas",
                    "",
                    "https://user-images.githubusercontent.com/65448513/103320948-b7120400-4a37-11eb-9b4b-f13ce679f282.png",
                    "Gardien  Numéro:1 "
                )
            )

            return list
        }
    }
}
