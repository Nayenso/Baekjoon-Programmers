SELECT
SUM(
CASE
    WHEN B.FISH_NAME = 'BASS' OR B.FISH_NAME = 'SNAPPER' THEN 1
    ELSE 0
END
) AS FISH_COUNT
FROM FISH_INFO A
INNER JOIN FISH_NAME_INFO B
ON A.FISH_TYPE = B.FISH_TYPE