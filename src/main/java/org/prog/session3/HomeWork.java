package org.prog.session3;

//TODO: print only valid emails
//TODO: valid email has:
//TODO: - at least 3 symbols before @
//TODO: - at least 7 symbols in domain (after @) (cannot start or end with dot)
//TODO: - 1 dot in domain
//TODO: - only one @

public class HomeWork {

    public static void main(String[] args) {
        String[] emails = {
                "asd.asd@asd.asd", //+
                "aa@asd.asd",
                "...@asd.asd", //+
                "asd.asd@asdasd.",
                "asd.asd@.asdasd",
                "asd@@.asdasd",
                "asd@@asd.asd",
                "some_email_that_is_very_long@long_domain_name.com" //+
        };


        for (String email : emails) {

            int firstGaw = email.indexOf("@");
            int lastGaw = email.lastIndexOf("@");

//gaw only one
            if (firstGaw != -1 && firstGaw == lastGaw) {

//login domen
                String login = email.substring(0, firstGaw);
                String domain = email.substring(firstGaw + 1);

//lenght
                if (login.length() >= 3 && domain.length() >= 7) {

                    //dots
                    if (!domain.startsWith(".") && !domain.endsWith(".")) {
                        int firstDot = domain.indexOf(".");
                        int lastDot = domain.lastIndexOf(".");
                        if (firstDot != -1 && firstDot == lastDot) {
                            System.out.println(email);
                        }
                    }
                }
            }
        }
    }
}