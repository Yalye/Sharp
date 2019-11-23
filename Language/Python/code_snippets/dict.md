### dict traversal
```season_dict = {"first": "spring",
                   "second": "summer",
                   "third": "autumn",
                   "forth": "winter"}
    # simple
    for i in season_dict:
        print "season_dict[%s]=" % i, season_dict[i]

    # items
    for (k, v) in season_dict.items():
        print "season_dict[%s]=" % k, v

    # iteritems
    for k, v in season_dict.iteritems():
        print "season_dict[%s]=" % k, v

    # iterkeys, itervalues
    for k, v in zip(season_dict.iterkeys(), season_dict.itervalues()):
        print "season_dict[%s]=" % k, v
```

