INSERT INTO todousers (username, password) VALUES
    ("Jane", "$2a$10$Ai2nvQwYgp5Bf11RDBaEbeVTsrwigcncGpDtWASqC2.k7ja/O6z8e"),
    ("John", "$2a$10$Ai2nvQwYgp5Bf11RDBaEbeVTsrwigcncGpDtWASqC2.k7ja/O6z8e"),
    ("Kate", "$2a$10$Ai2nvQwYgp5Bf11RDBaEbeVTsrwigcncGpDtWASqC2.k7ja/O6z8e");

INSERT INTO todos (title, is_done, owner_id) VALUES
    ("kutyat setaltatni", false, 1),
    ("kutyat megetetni", true, 1),
    ("vacsorazni", false, 2),
    ("reggelizni", true, 3);