package com.dst511s.skillconnect.components

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeJobCard(
    job: com.dst511s.skillconnect.data.models.Job
) {
//    Card(
//        modifier = Modifier.width(280.dp),
//        onClick = { /* Navigate to job details */ }
//    ) {
//        Column(
//            modifier = Modifier.padding(16.dp)
//        ) {
//            Row(
//                verticalAlignment = Alignment.CenterVertically
//            ) {
//                // Company logo
//                Box(
//                    modifier = Modifier
//                        .size(40.dp)
//                        .clip(RoundedCornerShape(8.dp))
//                        .background(MaterialTheme.colorScheme.surfaceVariant),
//                    contentAlignment = Alignment.Center
//                ) {
//                    if (job.companyLogoUrl != null) {
//                        AsyncImage(
//                            model = job.companyLogoUrl,
//                            contentDescription = job.company,
//                            modifier = Modifier.fillMaxSize(),
//                            contentScale = ContentScale.Crop
//                        )
//                    } else {
//                        Text(
//                            text = job.company.take(1),
//                            style = MaterialTheme.typography.titleMedium,
//                            color = MaterialTheme.colorScheme.primary
//                        )
//                    }
//                }
//
//                Spacer(modifier = Modifier.width(12.dp))
//
//                Column(
//                    modifier = Modifier.weight(1f)
//                ) {
//                    Text(
//                        text = job.company,
//                        style = MaterialTheme.typography.bodyMedium,
//                        color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.7f)
//                    )
//
//                    Text(
//                        text = job.title,
//                        style = MaterialTheme.typography.titleMedium,
//                        fontWeight = FontWeight.Bold,
//                        maxLines = 1,
//                        overflow = TextOverflow.Ellipsis
//                    )
//                }
//
//                if (job.isNew) {
//                    Box(
//                        modifier = Modifier
//                            .background(
//                                color = MaterialTheme.colorScheme.tertiary,
//                                shape = RoundedCornerShape(4.dp)
//                            )
//                            .padding(horizontal = 6.dp, vertical = 2.dp)
//                    ) {
//                        Text(
//                            text = "NEW",
//                            style = MaterialTheme.typography.labelSmall,
//                            color = MaterialTheme.colorScheme.onTertiary,
//                            fontWeight = FontWeight.Bold
//                        )
//                    }
//                }
//            }
//
//            Spacer(modifier = Modifier.height(16.dp))
//
//            // Job details
//            Row(
//                modifier = Modifier.fillMaxWidth()
//            ) {
//                // Location
//                Row(
//                    verticalAlignment = Alignment.CenterVertically,
//                    modifier = Modifier.weight(1f)
//                ) {
//                    Icon(
//                        imageVector = Icons.Default.LocationOn,
//                        contentDescription = null,
//                        modifier = Modifier.size(16.dp),
//                        tint = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f)
//                    )
//
//                    Spacer(modifier = Modifier.width(4.dp))
//
//                    Text(
//                        text = job.location,
//                        style = MaterialTheme.typography.bodySmall,
//                        color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f)
//                    )
//                }
//
//                // Job type
//                Row(
//                    verticalAlignment = Alignment.CenterVertically
//                ) {
//                    Icon(
//                        imageVector = Icons.Default.Work,
//                        contentDescription = null,
//                        modifier = Modifier.size(16.dp),
//                        tint = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f)
//                    )
//
//                    Spacer(modifier = Modifier.width(4.dp))
//
//                    Text(
//                        text = job.jobType,
//                        style = MaterialTheme.typography.bodySmall,
//                        color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f)
//                    )
//                }
//            }
//
//            Spacer(modifier = Modifier.height(12.dp))
//
//            // Match percentage
//            Row(
//                verticalAlignment = Alignment.CenterVertically
//            ) {
//                Text(
//                    text = "Match: ${job.matchPercentage}%",
//                    style = MaterialTheme.typography.bodySmall,
//                    fontWeight = FontWeight.Medium,
//                    modifier = Modifier.padding(end = 8.dp)
//                )
//
//                LinearProgressIndicator(
//                    progress = { job.matchPercentage / 100f },
//                    modifier = Modifier
//                        .weight(1f)
//                        .height(4.dp)
//                        .clip(RoundedCornerShape(2.dp)),
//                    color = when {
//                        job.matchPercentage >= 80 -> MaterialTheme.colorScheme.primary
//                        job.matchPercentage >= 60 -> MaterialTheme.colorScheme.tertiary
//                        else -> MaterialTheme.colorScheme.error
//                    },
//                    trackColor = MaterialTheme.colorScheme.surfaceVariant
//                )
//            }
//        }
//    }
}

//@Preview(showBackground = true)
//@Composable
//fun HomeJobCardPreview() {
//    SkillConnectTheme {
//        HomeJobCard(
//            job = Job(
////                id = "1",
////                title = "Junior Web Developer",
////                company = "TechCorp Solutions",
////                location = "Windhoek",
////                jobType = "Full-time",
////                matchPercentage = 85,
////                companyLogoUrl = null,
////                postedTimeAgo = "2 days ago",
////                isNew = true
//            )
//        )
//    }
//}